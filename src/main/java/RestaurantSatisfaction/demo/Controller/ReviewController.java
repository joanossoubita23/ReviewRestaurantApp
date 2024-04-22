package RestaurantSatisfaction.demo.Controller;

import RestaurantSatisfaction.demo.Entity.Review;
import RestaurantSatisfaction.demo.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;
    @GetMapping
    public List<Review> getReviewsByRestaurantId(@PathVariable Long restaurantId){
        return reviewRepository.findByRestaurantId(restaurantId);
    }
    @PostMapping
    public void addReview(@RequestBody Review review){
        reviewRepository.save(review);
    }
}
