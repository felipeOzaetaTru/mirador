package com.ZenithApp.mirador.repository.user;

import com.ZenithApp.mirador.commons.domains.dto.user.UserDTO;
import com.ZenithApp.mirador.commons.domains.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {
    @Query("SELECT u FROM UserEntity u WHERE u.email = :email AND u.password = :password")
        Optional<UserEntity> findUserByEmailAndPassword(@Param("email") String email,
                                                 @Param("password") String password);
}
