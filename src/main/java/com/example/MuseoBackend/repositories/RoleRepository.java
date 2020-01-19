package com.example.MuseoBackend.repositories;

import com.example.MuseoBackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface RoleRepository extends JpaRepository<Role, Id> {

}
