package tn.esprit.arctic.demo2.service;

import tn.esprit.arctic.demo2.entities.Composant;

import java.util.List;

public interface IComposantService {
    List<Composant> retrieveAllComposants();
    Composant addComposant(Composant e );
    Composant updateComposant(Composant e);
    Composant retrieveComposant(Long idComposant);
    void removeComposant(Long idComposant);
    List<Composant> addComposants(List<Composant> composants);
}
