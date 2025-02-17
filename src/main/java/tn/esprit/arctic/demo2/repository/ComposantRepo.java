package tn.esprit.arctic.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo2.entities.Composant;


public interface ComposantRepo extends JpaRepository<Composant, Long> {
}
