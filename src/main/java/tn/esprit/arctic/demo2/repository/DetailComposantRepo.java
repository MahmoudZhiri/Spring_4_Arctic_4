package tn.esprit.arctic.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo2.entities.DetailComposant;

public interface DetailComposantRepo extends JpaRepository<DetailComposant, Long>{
}
