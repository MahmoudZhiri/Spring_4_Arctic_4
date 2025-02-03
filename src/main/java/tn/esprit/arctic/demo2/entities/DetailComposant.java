package tn.esprit.arctic.demo2.entities;

import jakarta.persistence.*;

@Entity
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private Enum.TypeComposant typeComposant;


}
