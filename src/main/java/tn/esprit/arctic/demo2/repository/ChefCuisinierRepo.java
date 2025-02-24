package tn.esprit.arctic.demo2.repository;

import tn.esprit.arctic.demo2.entities.ChefCuisinier;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ChefCuisinierRepo  extends JpaRepository<ChefCuisinier, Long>{
}
