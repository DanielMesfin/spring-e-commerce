package com.daniel.springweb.Repository;

import com.daniel.springweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
