package com.praneethsettipalli.userservice.repository;

import com.praneethsettipalli.userservice.entity.UserObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserObject,Long> {

    UserObject findByUserId(Long userId);
}
