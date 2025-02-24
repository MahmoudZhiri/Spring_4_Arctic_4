package tn.esprit.arctic.demo2.entities;


import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.Set;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Component



@Entity
public class ChaineRestauration  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;

    private String libelle;

    private LocalDate dateCreation;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="chaineRestauration")
    private Set<Restaurant> restaurants;




}
