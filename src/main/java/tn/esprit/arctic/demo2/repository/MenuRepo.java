package tn.esprit.arctic.demo2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.arctic.demo2.entities.Menu;
import tn.esprit.arctic.demo2.entities.Enum;

import java.util.List;


public interface MenuRepo extends JpaRepository<Menu, Long>{
    //List<Menu> findByTypeMenuAndComposants_

    @Query("SELECT m.libelleMenu FROM Menu m WHERE m.typeMenu = :typeMenu ORDER BY m.prixTotal ASC")
    List<String> findlibelleMenuByTypeOrderedByprixTotal(@Param("typeMenu") Enum.TypeMenu typeMenu);

    @Query("SELECT DISTINCT m FROM Menu m JOIN Composant c JOIN DetailComposant d  WHERE d.typeComposant = :typeComposant")
    List<Menu> findMenusByTypeComposant(@Param("typeComposant") Enum.TypeComposant typeComposant);


}
