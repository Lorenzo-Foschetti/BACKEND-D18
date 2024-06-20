package lorenzofoschetti.u5d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pizza {
    List<Topping> toppings;
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private double price;
    private int calories;

    public Pizza(List<Topping> toppings, String name, double price, int calories) {
        this.toppings = toppings;
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", toppings=" + toppings +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
