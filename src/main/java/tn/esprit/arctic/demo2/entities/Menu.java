package tn.esprit.arctic.demo2.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private Enum.TypeMenu typeMenu;

    private Float prixTotal;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private Set<Commande> commandes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private Set<Composant> composants;

    @ManyToMany(mappedBy="menus", cascade = CascadeType.ALL)
    private Set<ChefCuisinier> chefCuisiniers;

}

