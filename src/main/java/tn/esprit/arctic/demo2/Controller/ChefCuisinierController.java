package tn.esprit.arctic.demo2.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.arctic.demo2.serviceImplementations.IChefCuisinerService;

@RestController
@AllArgsConstructor
public class ChefCuisinierController {
    IChefCuisinerService chefCuisinerService;
}
