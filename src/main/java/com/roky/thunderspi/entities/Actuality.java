package com.roky.thunderspi.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class Actuality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idActuality;

<<<<<<< HEAD

=======
    @OneToMany(mappedBy = "actuality", cascade = CascadeType.REMOVE)
    private Set<Post> blogPostset;
>>>>>>> 98f4b4a53f36d482972327191e0a2e175ed8fcaf
}
