package tn.esprit.arctic.demo2.serviceImplementations;


import tn.esprit.arctic.demo2.entities.DetailComposant;

import java.util.List;

public interface IDetailComposantService {
    List<DetailComposant> retrieveAllDetailComposants();
    DetailComposant addDetailComposant(DetailComposant e);
    DetailComposant updateDetailComposant(DetailComposant e);
    DetailComposant retrieveDetailComposant(Long idDetailComposant);
    void removeDetailComposant(Long idDetailComposant);
    List<DetailComposant> addDetailComposants (List<DetailComposant> DetailComposants);
}
