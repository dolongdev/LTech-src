package com.edu.ltech.dao;


import com.edu.ltech.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role, String> {

}
