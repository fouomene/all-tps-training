package com.dixmillescodeurs.poo.hello.repository;

import com.dixmillescodeurs.poo.hello.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
/**
 * @author Daniel FOUOMENE
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Since email is unique, we'll find users by email
    Optional<User> findByEmail(String email);
}