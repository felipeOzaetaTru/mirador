package com.ZenithApp.mirador.repository.user;

import com.ZenithApp.mirador.commons.domains.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {

}
