package tn.esprit.arctic.demo2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;

    private LocalDate dateCommande;

    private Integer pourcentageRemise;

    private Float totalRemise;

    private Float totalCommande;

    private Long note;

    @ManyToOne
    Client client;
    @ManyToOne
    Menu menu;
}
