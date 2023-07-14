package com.dixmillescodeurs.poo.hello.repository;

import com.dixmillescodeurs.poo.hello.model.entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * @author Daniel FOUOMENE
 */
@Repository
public interface VoyageRepository extends JpaRepository<Voyage,Long> {


  boolean existsByNomIgnoreCase(String nom);

  Optional<Voyage> findVoyageByNom(String nom);

}
