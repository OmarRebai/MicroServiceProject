package tn.enis.evenement.entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Evenement implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String titre;
    @NonNull @Temporal(TemporalType.DATE)
    private Date date;
    @NonNull
    private String lieu;
}
