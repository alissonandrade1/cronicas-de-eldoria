package com.alissondev.cronicas_de_eldoria.repository;


import com.alissondev.cronicas_de_eldoria.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
