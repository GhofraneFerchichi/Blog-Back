package com.roky.thunderspi.entities;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;



import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

@Builder
=======
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
<<<<<<< HEAD
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
=======
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCourse ;
    String name;
    String educationLevel;
    String length;
<<<<<<< HEAD
    //@Column(name = "date_added")
    //LocalDate dateAdded;
    //LocalDate dateUpdated;
    String courseLanguage;
    /*static {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
    }*/

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")

    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")

    private Date updatedAt;


    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Date();
    }

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonIgnore
    CourseSubject courseSubject;
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JsonIgnore
    Set<LibElement> libElements;




    @ManyToOne(cascade = CascadeType.DETACH)

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
=======
    LocalDate dateAdded;
    LocalDate dateUpdated;
    String courseLanguage;
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf

    @OneToMany(mappedBy = "course", cascade = {CascadeType.PERSIST, CascadeType.DETACH})
    private Set<Project> projects = new LinkedHashSet<>();

<<<<<<< HEAD
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
=======
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
