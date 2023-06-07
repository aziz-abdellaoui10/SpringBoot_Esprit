package Repositories;

import Entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPisteRepository extends JpaRepository<Piste, Long> {
}
