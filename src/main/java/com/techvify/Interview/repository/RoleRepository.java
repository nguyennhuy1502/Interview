package com.techvify.Interview.repository;

import com.techvify.Interview.entity.user.ERole;
import com.techvify.Interview.entity.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
