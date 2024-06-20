package lorenzofoschetti.u5d4.repositories;

import lorenzofoschetti.u5d4.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {


}
