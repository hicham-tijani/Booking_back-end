package com.example.bookingSpingboot.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select s from User s where username= :username and pwd = :pwd")
    User loginUser(String username, String pwd);
}