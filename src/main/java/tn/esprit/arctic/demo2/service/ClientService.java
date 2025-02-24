package tn.esprit.arctic.demo2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.demo2.entities.Client;
import tn.esprit.arctic.demo2.serviceImplementations.IClientService;
import tn.esprit.arctic.demo2.repository.ClientRepo;

import java.util.List;
@Service

@AllArgsConstructor
public class ClientService implements IClientService {
    ClientRepo clientRepository;

    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client e) {
        clientRepository.save(e);
        return e;
    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client retrieveClient(Long idClient) {
        return clientRepository.findById(idClient).get();
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> clients) {
       return clientRepository.saveAll(clients);
    }
}