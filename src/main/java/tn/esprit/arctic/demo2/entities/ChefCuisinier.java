package tn.esprit.arctic.demo2.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
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
