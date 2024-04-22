package RestaurantSatisfaction.demo.Repository;

import RestaurantSatisfaction.demo.Entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
