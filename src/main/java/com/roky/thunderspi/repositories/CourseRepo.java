package com.roky.thunderspi.repositories;

import com.roky.thunderspi.entities.Course;
<<<<<<< HEAD
import com.roky.thunderspi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
  @Query("SELECT c FROM Course c WHERE c.user.id= ?1")
    List<Course> getCourseByTeachersId(Long i);
    @Query("SELECT COUNT(c),c.courseSubject.subjectCategory FROM Course c GROUP BY c.courseSubject.subjectCategory")
    List<Object> getCourseBySubject();


=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
