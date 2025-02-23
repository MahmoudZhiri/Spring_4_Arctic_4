package tn.esprit.arctic.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo2.entities.Client;
import tn.esprit.arctic.demo2.entities.Commande;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepo extends JpaRepository<Commande, Long>{
    List<Commande> findByClient(Client client);
    List<Commande> findByClient_identifiantAndDateCommandeBetween(String client_identifiant, LocalDate dateCommande, LocalDate dateCommande2);
    List<Commande> findByOrderByNoteAndDateCommandeBetween(LocalDate dateCommande, LocalDate dateCommande2, Long note);

}
