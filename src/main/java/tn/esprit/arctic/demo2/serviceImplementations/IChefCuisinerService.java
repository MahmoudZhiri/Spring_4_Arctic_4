package tn.esprit.arctic.demo2.serviceImplementations;


import tn.esprit.arctic.demo2.entities.ChefCuisinier;

import java.util.List;
public interface IChefCuisinerService  {
    List<ChefCuisinier> retrieveAllChefsCuisinier();
    ChefCuisinier addChefCuisinier(ChefCuisinier e);
    ChefCuisinier updateChefCuisinier(ChefCuisinier e);
    ChefCuisinier retrieveChefCuisinier(Long idChefCuisinier);
    void removeChefCuisinier(Long idChefCuisinier);
    List<ChefCuisinier> addChefsCuisinier (List<ChefCuisinier> ChefsCuisinier);
}
