package com.roky.thunderspi.services;

<<<<<<< HEAD
import com.roky.thunderspi.entities.LibCategory;
import com.roky.thunderspi.repositories.LibCategoryrepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class LibCategoryServiceImpl implements ILibCategoryService{

    private final LibCategoryrepo libCategoryrepo;
    @Override
    public List<LibCategory> findAllLibCat() {
        return libCategoryrepo.findAll();
    }

    @Override
    public LibCategory findLibCatById(Long id) {
        return libCategoryrepo.findById(id).orElse(null);
    }

    @Override
    public LibCategory addLibCat(LibCategory libCategory) {
        return libCategoryrepo.save(libCategory);
    }

    @Override
    public LibCategory editLibCat(LibCategory libCategory) {
        return libCategoryrepo.save(libCategory);
    }

    @Override
    public void deleteLibCat(Long id) {
        libCategoryrepo.deleteById(id);

    }
=======
public class LibCategoryServiceImpl {
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
