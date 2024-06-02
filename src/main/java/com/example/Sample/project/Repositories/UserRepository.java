package com.example.Sample.project.Repositories;



import com.example.Sample.project.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
    public interface UserRepository extends JpaRepository<User, Long> {
    Optional<com.example.Sample.project.Models.User> findByName(String username);
}
