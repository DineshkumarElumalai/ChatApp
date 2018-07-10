package com.freshworks.chatapp.repository;

import com.freshworks.chatapp.model.Doctors;
import com.freshworks.chatapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctors, Long> {
    @Query(value = "SELECT from doctors where email = ?1", nativeQuery = true)
    Doctors deleteByEmailId(String emailId);
}
