package tn.esprit.arctic.demo2.serviceImplementations;


import tn.esprit.arctic.demo2.entities.ChaineRestauration;

import java.util.List;

public interface IChaineRestaurationService {
    List<ChaineRestauration> retrieveAllChainesRestauration();
    ChaineRestauration addChaineRestauration(ChaineRestauration e);
    ChaineRestauration updateChaineRestauration(ChaineRestauration e);
    ChaineRestauration retrieveChaineRestauration(Long idChaineRestauration);
    void removeChaineRestauration(Long idChaineRestauration);
    List<ChaineRestauration> addChainesRestauration(List<ChaineRestauration> chainesRestauration);
}