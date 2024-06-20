package lorenzofoschetti.u5d4;

import lorenzofoschetti.u5d4.entities.Drink;
import lorenzofoschetti.u5d4.entities.Pizza;
import lorenzofoschetti.u5d4.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BeansConfig {
    @Bean
    public Topping pomodoro() {
        return new Topping("Pomodoro", 0.8, 40);
    }


    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 1.2, 80);
    }

    @Bean
    public Topping salamePiccante() {
        return new Topping("Salame Piccante", 1.1, 100);
    }

    @Bean
    public Topping Alici() {
        return new Topping("Alici", 0.5, 30);
    }

    @Bean
    public Pizza Margherita() {
        return new Pizza(Arrays.asList(pomodoro(), mozzarella()), "Margherita", 6.5, 300);
    }


    @Bean
    public Pizza Diavola() {
        return new Pizza(Arrays.asList(pomodoro(), mozzarella(), salamePiccante()), "Diavola", 7.5, 350);
    }

    @Bean
    public Pizza Napoli() {
        return new Pizza(Arrays.asList(pomodoro(), mozzarella(), Alici()), "Napoli", 8, 300);
    }

    @Bean
    public Drink Cocacola() {
        return new Drink(1.8, 50, "Coca Cola");
    }

    @Bean
    public Drink Birra() {
        return new Drink(3.5, 200, "Birra");
    }


}
