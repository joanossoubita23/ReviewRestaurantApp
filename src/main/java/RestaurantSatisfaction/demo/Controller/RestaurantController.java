package RestaurantSatisfaction.demo.Controller;

import RestaurantSatisfaction.demo.Entity.Restaurant;
import RestaurantSatisfaction.demo.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @GetMapping
    public List<Restaurant>getAllRestaurants(){
        return restaurantRepository.findAll();
    }
    @PostMapping
    public void addRestaurant (@RequestBody Restaurant restaurant){
        restaurantRepository.save(restaurant);
    }
}
