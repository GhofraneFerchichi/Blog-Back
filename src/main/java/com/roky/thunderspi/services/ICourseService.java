package com.roky.thunderspi.services;

<<<<<<< HEAD
import com.roky.thunderspi.entities.Course;
import com.roky.thunderspi.entities.Project;

import java.util.List;
import java.util.stream.Stream;

public interface ICourseService  {
    List<Course> findAllCourses();
    Course findCouresById(Long idCourse);
    Course addCourse(Course course);
    Course editCourses(Course course);
    void deleteCourses(Long idCourse);

=======
public interface ICourseService {
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
