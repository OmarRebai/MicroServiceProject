package tn.enis.outil.entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name= "type_mbr", discriminatorType = DiscriminatorType.STRING,length = 3)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Outil implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull @Temporal(TemporalType.DATE)
    private Date date;
    @NonNull
    private String source;
}
