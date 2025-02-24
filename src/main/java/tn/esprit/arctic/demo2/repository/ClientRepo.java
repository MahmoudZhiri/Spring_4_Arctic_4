package tn.esprit.arctic.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.demo2.entities.Client;


public interface ClientRepo extends JpaRepository<Client, Long> {//long heya type mtaa l pk déclarée fel entity

}
