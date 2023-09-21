package tn.enis.member.entities;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Etudiant extends Member {
    @NonNull
    private Date dateInscription;
    @NonNull
    private String Diplome;

}
