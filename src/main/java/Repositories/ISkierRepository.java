package Repositories;

import Entities.Skier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ISkierRepository extends JpaRepository<Skier, Long> {

    public Skier findByNomSAndPrenomS(String nom, String prenom);
    public List<Skier> findByDateNaissanceGreaterThan(Date dateNaissance);
    public Skier findByNomSAndPrenomSAndDateNaissance(String nom, String prenom, Date dateNaissance);

    @Query("SELECT a FROM Skier a WHERE a.nomS=:x AND a.prenomS=:y")
    public Skier getSkier(@Param("x") String x, @Param("y") String y);

}
