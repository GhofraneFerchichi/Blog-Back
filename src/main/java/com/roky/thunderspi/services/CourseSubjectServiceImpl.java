package com.roky.thunderspi.services;

<<<<<<< HEAD
import com.roky.thunderspi.entities.CourseSubject;
import com.roky.thunderspi.repositories.CourseSubjectRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CourseSubjectServiceImpl implements ICourseSubjectService {
    private final CourseSubjectRepo courseSubjectRepo;



    @Override
    public List<CourseSubject> findAllCoursesSubject() {
        return courseSubjectRepo.findAll();
    }

    @Override
    public CourseSubject findCouresSubjectById(Long id) {
        return courseSubjectRepo.findById(id).orElse(null);
    }

    @Override
    public CourseSubject addCoursesSubject(CourseSubject courseSubject) {
        return courseSubjectRepo.save(courseSubject);
    }

    @Override
    public CourseSubject editCoursesSubject(CourseSubject courseSubject) {
        return courseSubjectRepo.save(courseSubject);
    }

    @Override
    public void deleteCoursesSubject(Long id) {
        courseSubjectRepo.deleteById(id);

    }
=======
import org.springframework.stereotype.Service;

@Service
public class CourseSubjectServiceImpl {
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
