package RestaurantSatisfaction.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "restaurant_id")
    private Long restaurantId;
    private int rating;
    private String comment;

    public Review(Long id, Long restaurantId, int rating, String comment) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.rating = rating;
        this.comment = comment;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Review() {
    }
}
