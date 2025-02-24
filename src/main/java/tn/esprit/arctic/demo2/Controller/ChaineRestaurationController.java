package tn.esprit.arctic.demo2.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.demo2.serviceImplementations.IChaineRestaurationService;

@RestController
@AllArgsConstructor
public class ChaineRestaurationController {
    IChaineRestaurationService chaineRestaurationService;

}
