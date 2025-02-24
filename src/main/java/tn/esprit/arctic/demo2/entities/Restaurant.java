package tn.esprit.arctic.demo2.entities;

import jakarta.persistence.*;

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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;

    private String nom;

    private Long nbPlacesMax;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Menu> menus;

    @ManyToOne
    ChaineRestauration chaineRestauration;
}
