package Repositories;

import Entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInscriptionRepository extends JpaRepository<Inscription, Long> {
}
