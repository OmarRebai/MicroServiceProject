package tn.enis.member.entities;


import lombok.*;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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
    private String Diplome;
    @Builder
    public Etudiant (Long id, String cin, String nom, String prenom, Date dateNaissance, Byte photo, String cv, String email, String password, @NonNull Date dateInscription, @NonNull String diplome) {
        super(id, cin, nom, prenom, dateNaissance, photo, cv, email, password);
        this.dateInscription = dateInscription;
        Diplome = diplome;
    }

}
