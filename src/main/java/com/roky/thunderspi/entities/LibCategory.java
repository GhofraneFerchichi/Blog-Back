package com.roky.thunderspi.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
<<<<<<< HEAD

import javax.persistence.*;
import java.util.Set;
=======
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
public class LibCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idLibCategory;
    String categoryName;
<<<<<<< HEAD

    @OneToMany(mappedBy = "libCategory",cascade = CascadeType.REMOVE)
    Set<LibElement> libElements;
=======
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
