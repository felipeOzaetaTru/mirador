package com.ZenithApp.mirador.webApi.user;

import com.ZenithApp.mirador.commons.domains.dto.user.UserDTO;
import com.ZenithApp.mirador.commons.domains.responseDTO.GenericResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface IUserApi {
    @PostMapping()
    ResponseEntity<GenericResponseDTO> serviceUser(@RequestBody UserDTO userDTO);
    @PostMapping()
    ResponseEntity<GenericResponseDTO> createUser(@RequestBody UserDTO userDTO);
    @GetMapping()
    ResponseEntity<GenericResponseDTO> readUser(@RequestBody UserDTO userDTO);
    @GetMapping()
    ResponseEntity<GenericResponseDTO> readUsers();
    @PutMapping()
    ResponseEntity<GenericResponseDTO> updateUser(@RequestBody UserDTO userDTO);
    @DeleteMapping()
    ResponseEntity<GenericResponseDTO> deleteUser(@PathVariable Integer userId);
}
