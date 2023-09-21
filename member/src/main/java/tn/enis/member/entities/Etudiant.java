package tn.enis.member.entities;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Etudiant extends Member {
    private Date dateInscription;
    private String Diplome;

}
