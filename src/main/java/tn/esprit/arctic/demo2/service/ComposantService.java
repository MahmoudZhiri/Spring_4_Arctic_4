package tn.esprit.arctic.demo2.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.demo2.entities.Composant;
import tn.esprit.arctic.demo2.serviceImplementations.IComposantService;
import tn.esprit.arctic.demo2.repository.ComposantRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class ComposantService implements IComposantService {
    ComposantRepo composantRepository;

    @Override
    public List<Composant> retrieveAllComposants() {
        return composantRepository.findAll();
    }

    @Override
    public Composant addComposant(Composant e) {
        composantRepository.save(e);
        return e;
    }

    @Override
    public Composant updateComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Composant retrieveComposant(Long idComposant) {
        return composantRepository.findById(idComposant).get();
    }

    @Override
    public void removeComposant(Long idComposant) {
        composantRepository.deleteById(idComposant);
    }

    @Override
    public List<Composant> addComposants(List<Composant> composants) {
        return null;
    }
}
