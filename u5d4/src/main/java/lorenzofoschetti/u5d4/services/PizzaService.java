package lorenzofoschetti.u5d4.services;

import lorenzofoschetti.u5d4.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;
}
