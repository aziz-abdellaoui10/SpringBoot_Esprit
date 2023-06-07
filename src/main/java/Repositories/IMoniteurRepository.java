package Repositories;

import Entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMoniteurRepository extends JpaRepository<Moniteur, Long> {
}
