package Repositories;

import Entities.Cours;
import Entities.Moniteur;
import Entities.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICoursRepository extends JpaRepository<Cours, Long> {

    @Query("SELECT DISTINCT i.numSemaine FROM Inscription i JOIN i.cours c WHERE c.moniteur = :moniteur AND c.support = :support")
    List<Integer> findWeekNumbersByMoniteurAndSupport(@Param("moniteur") Moniteur moniteur, @Param("support") Support support);

}
