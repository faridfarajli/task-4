package az.ingress.lesson4.dto.repository;

import az.ingress.lesson4.domain.FruitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<FruitEntity, Long> {
   boolean existsById(Long id);
   void deleteById(Long id);

}
