package com.roky.thunderspi.entities;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

=======
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class CourseSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCourseSubject;
    String subjectCategory;
<<<<<<< HEAD
    @OneToMany(mappedBy = "courseSubject",cascade = CascadeType.REMOVE)
    @JsonIgnore
    Set<Course> courses;
=======
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
