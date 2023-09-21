package tn.enis.member.entities;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr", discriminatorType =
        DiscriminatorType.STRING,length = 3)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public abstract class Member implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String cin;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private Byte photo;
    private String cv;
    @NonNull
    private String email;
    @NonNull
    private String password;
}
