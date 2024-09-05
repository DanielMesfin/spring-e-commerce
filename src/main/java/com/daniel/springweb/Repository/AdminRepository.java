package com.daniel.springweb.Repository;
import com.daniel.springweb.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
