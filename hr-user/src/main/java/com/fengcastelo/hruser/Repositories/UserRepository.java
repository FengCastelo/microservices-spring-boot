package com.fengcastelo.hruser.Repositories;

import com.fengcastelo.hruser.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
