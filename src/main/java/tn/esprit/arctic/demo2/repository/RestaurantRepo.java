package tn.esprit.arctic.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo2.entities.Restaurant;
import java.util.List;

public interface RestaurantRepo extends JpaRepository<Restaurant, Long>{


}
