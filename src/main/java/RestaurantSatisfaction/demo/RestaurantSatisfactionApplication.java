package RestaurantSatisfaction.demo;

import RestaurantSatisfaction.demo.Entity.Restaurant;
import RestaurantSatisfaction.demo.Entity.Review;
import RestaurantSatisfaction.demo.Repository.RestaurantRepository;
import RestaurantSatisfaction.demo.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class RestaurantSatisfactionApplication implements CommandLineRunner {
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Autowired
	private ReviewRepository reviewRepository;

	private final List<String> restaurantNames = Arrays.asList(
			"Tasty Treats", "Delicious Dishes", "Yummy Bites", "Gourmet Grub", "Savory Delights"
	);

	private final String[] reviews = {
			"Amazing food and great service!",
			"The food was delicious but the service was slow.",
			"I didn't enjoy the food much, but the ambiance was nice.",
			"Best restaurant in town! Highly recommended.",
			"Disappointing experience. Food was cold and tasteless."
	};



	public static void main(String[] args) {
		SpringApplication.run(RestaurantSatisfactionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (String name : restaurantNames) {
			Restaurant restaurant = new Restaurant();
			restaurant.setName(name);
			restaurantRepository.save(restaurant);
		}

		// Generate and save sample reviews for each restaurant

	}
}

