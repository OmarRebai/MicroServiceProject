package tn.enis.member.entities;


import lombok.*;

import org.springframework.lang.NonNull;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
@DiscriminatorValue("etd")
public class Etudiant extends Member {
    @NonNull
    private Date dateInscription;
    @NonNull
    private String Diplome;

}
