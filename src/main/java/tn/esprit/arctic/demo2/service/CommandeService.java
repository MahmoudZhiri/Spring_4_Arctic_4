package tn.esprit.arctic.demo2.service;

import tn.esprit.arctic.demo2.entities.Commande;
import tn.esprit.arctic.demo2.repository.CommandeRepo;

import java.util.List;

public class CommandeService implements ICommandeService{
    CommandeRepo commandeRepository;

    @Override
    public List<Commande> retrieveAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande addCommande(Commande e) {
        commandeRepository.save(e);
        return e;
    }

    @Override
    public Commande updateCommande(Commande e) {
        return commandeRepository.save(e);
    }

    @Override
    public Commande retrieveCommande(Long idCommande) {
        return commandeRepository.findById(idCommande).get();
    }

    @Override
    public void removeCommande(Long idCommande) {
        commandeRepository.deleteById(idCommande);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }
}
