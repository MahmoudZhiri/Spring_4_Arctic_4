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
@Entity
@Component
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;

    private String prenom;

    @Enumerated(EnumType.STRING)
    private Enum.TypeChef typeChef;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Menu> menus;
}
