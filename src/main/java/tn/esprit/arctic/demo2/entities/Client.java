package tn.esprit.arctic.demo2.entities;



import jakarta.persistence.*;



import java.time.LocalDate;
import java.util.Date;
import java.util.Set;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Entity
public class Client  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String identifiant;

    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;
    @jakarta.persistence.Id
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<Commande> commandes;


}




