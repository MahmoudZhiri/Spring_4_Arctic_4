package tn.esprit.arctic.demo2.entities;

import jakarta.persistence.*;

@Entity
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;

    private String nomComposant;

    private Float prix;

   @ManyToOne
    Menu menu;
   @OneToOne
    private DetailComposant detailComposant;
}
