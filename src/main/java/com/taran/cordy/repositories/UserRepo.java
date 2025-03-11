package com.taran.cordy.repositories;

import com.taran.cordy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
