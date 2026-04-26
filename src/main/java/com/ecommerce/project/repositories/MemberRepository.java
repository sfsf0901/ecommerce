package com.ecommerce.project.repositories;

import com.ecommerce.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<User, Long> {

}
