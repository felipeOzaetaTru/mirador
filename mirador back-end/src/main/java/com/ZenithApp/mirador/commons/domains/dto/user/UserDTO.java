package com.ZenithApp.mirador.commons.domains.dto.user;

import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserDTO implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private String emailVerified;
    private String rol;
    private String image;
    private String Password;
}
