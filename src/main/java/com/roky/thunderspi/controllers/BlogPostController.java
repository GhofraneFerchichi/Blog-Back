package com.roky.thunderspi.controllers;

import com.roky.thunderspi.dto.PostDto;
import com.roky.thunderspi.entities.Image;
import com.roky.thunderspi.entities.Post;
import com.roky.thunderspi.entities.User;
import com.roky.thunderspi.exception.ResourceNotFoundException;
import com.roky.thunderspi.message.ResponseMessage;
import com.roky.thunderspi.repositories.PostRepo;
import com.roky.thunderspi.repositories.UserRepo;
import com.roky.thunderspi.services.BlogPostServiceImpl;
import com.roky.thunderspi.services.ImageServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/posts")
public class BlogPostController {

    @Autowired
    private BlogPostServiceImpl postService;
private PostRepo postRepo;
    private final UserRepo userRepo;

    private ImageServiceImp imageServiceImp;
    private final com.roky.thunderspi.repositories.imlageRepo imlageRepo;

    @PostMapping("/addp")
    public ResponseEntity createPost(@RequestBody PostDto postDto){

       // postService.createPost(postDto);

        return new ResponseEntity(HttpStatus.OK);



    }

    @PostMapping("/add")
    public ResponseEntity<ResponseMessage> addPost(@RequestParam MultipartFile file, @RequestBody Post post) {
        String message = "";
        try {
            imageServiceImp.store(file);
            String filename = StringUtils.cleanPath(file.getOriginalFilename());
            Image libFile = new Image(filename, file.getContentType(), file.getBytes());
            imlageRepo.save(libFile);
            post.setTitle(filename);
            post.setFileType(file.getContentType());
            post.setIdFile(libFile.getId());
            postService.createPost(post);
            message = "Uploaded File successfully: " + file.getOriginalFilename();
            postRepo.save(post);
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Could not upload file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }}

    @GetMapping("/all")
    public ResponseEntity<List<PostDto>> showAllPosts(){
        return new ResponseEntity<>(postService.showAllPosts(),HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PostDto> getSinglePost(@PathVariable @RequestBody Long id){

        return  new ResponseEntity<>(postService.readSinglePost(id),HttpStatus.OK);
    }
    @PutMapping(value = "/edit/{id}")
    public ResponseEntity update(@RequestBody Post post) {
        this.postService.savePost(post);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }
    @PostMapping("/upload-image")
    public Post uploadImage(MultipartHttpServletRequest request) throws IOException {
        // Get the image bytes from the request
        MultipartFile file = request.getFile("image");
        byte[] bytes = file.getBytes();

        // Create a new Post entity and set its image bytes
        Post post = new Post();
        post.setImage(String.valueOf(bytes));

        // Save the Post entity to the database
        return postRepo.save(post);
    }
    @DeleteMapping("/{id}")
    public Map<String, Boolean> delete(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Post post = postRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found for this id :: " + id));

        postRepo.delete(post);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}