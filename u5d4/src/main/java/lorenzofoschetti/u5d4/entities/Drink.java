package lorenzofoschetti.u5d4.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Drink {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long id;
    private String name;
    private Double price;
    private int calories;

    public Drink(Double price, int calories, String name) {
        this.price = price;
        this.calories = calories;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
