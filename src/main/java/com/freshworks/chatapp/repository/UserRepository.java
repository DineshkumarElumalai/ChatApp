package com.freshworks.chatapp.repository;

import com.freshworks.chatapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    @Query(value = "SELECT * FROM users WHERE email = ?1", nativeQuery = true)
    Users findByEmailId(String emailId);
}
