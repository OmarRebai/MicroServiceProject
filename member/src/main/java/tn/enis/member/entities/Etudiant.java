package tn.enis.member.entities;


import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("etd")
public class Etudiant extends Member {
    @NonNull
    private Date dateInscription;
    @NonNull
    private String diplome;
    @ManyToOne
    private EnseignantChercheur enseignantChercheur;

    @Builder
    public Etudiant (Long id, @NonNull String cin, @NonNull String nom, @NonNull String prenom, @NonNull Date dateNaissance, Byte photo, String cv, @NonNull String email, @NonNull String password, @NonNull Date dateInscription, @NonNull String diplome, EnseignantChercheur enseignantChercheur) {
        super(id, cin, nom, prenom, dateNaissance, photo, cv, email, password);
        this.dateInscription = dateInscription;
        this.diplome = diplome;
        this.enseignantChercheur = enseignantChercheur;
    }
}
