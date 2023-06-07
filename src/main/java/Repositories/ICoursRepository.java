package Repositories;

import Entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoursRepository extends JpaRepository<Cours, Long> {
}
