package tn.esprit.arctic.demo2.serviceImplementations;


import tn.esprit.arctic.demo2.entities.Restaurant;

import java.util.List;

public interface IRestaurantService {
    List<Restaurant> retrieveAllRestaurants();
    Restaurant addRestaurant(Restaurant e);
    Restaurant updateRestaurant(Restaurant e);
    Restaurant retrieveRestaurant(Long idRestaurant);
    void removeRestaurant(Long idRestaurant);
    List<Restaurant> addRestaurants (List<Restaurant> Restaurants);
}
