package Repositories;

import Entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAbbonnementRepository extends JpaRepository<Abonnement, Long> {
}
