package Repositories;

import Entities.Abonnement;
import Entities.Skier;
import Entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IAbbonnementRepository extends JpaRepository<Abonnement, Long> {

    @Query("SELECT abonnement FROM Abonnement abonnement WHERE abonnement.typeAbon=:x ORDER BY abonnement.dateDebut")
    public List<Abonnement> getAbonnementsByTypeAbonOrderedByDateDebut(@Param("x") TypeAbonnement x);

    @Query("SELECT abonnement FROM Abonnement abonnement WHERE abonnement.dateDebut BETWEEN :x and :y")
    public List<Abonnement> getAbonnementBetweenTwoDates(@Param("x") Date x, @Param("y") Date y);
}
