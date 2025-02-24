package tn.esprit.arctic.demo2.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.demo2.serviceImplementations.IDetailComposantService;

@RestController
@AllArgsConstructor
public class DetailComposantController {
    IDetailComposantService detailComposantService;
}
