package RestaurantSatisfaction.demo.Repository;

import RestaurantSatisfaction.demo.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository  extends JpaRepository<Review, Long> {
    List<Review> findByRestaurantId(Long restaurantId);
}
