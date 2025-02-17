package tn.esprit.arctic.demo2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo2.entities.Menu;


public interface MenuRepo extends JpaRepository<Menu, Long>{
}
