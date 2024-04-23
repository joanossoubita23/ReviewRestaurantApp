package RestaurantSatisfaction.demo.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long Id;
    @Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false)
    private String role;

    public User(Long id, String username, String role) {
        Id = id;
        this.username = username;
        this.role = role;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User() {
    }
}
