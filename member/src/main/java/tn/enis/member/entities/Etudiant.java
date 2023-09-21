package tn.enis.member.entities;

import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Etudiant extends Member {
    @NonNull
    private Date dateInscription;
    @NonNull
    private String Diplome;

}
