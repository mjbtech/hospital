/*package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.User;
import com.hospital.model.UserRequest;
import com.hospital.model.UserResponse;
import com.hospital.repository.UserRepository;
//import com.hospital.utils.JwtUtil;
 
@RestController
public class AppController {
 
    @Autowired
    private UserRepository userRepo;*/
	/*
	 * @Autowired private AuthenticationManager authenticationManager;
	 */
	/*
	 * @Autowired private JwtUtil jwtUtil;
	 */
    
	/*
	 * @Autowired private BCryptPasswordEncoder pwdEncoder;
	 */

	/*
	 * @GetMapping(path = "/userDetails", produces=MediaType.APPLICATION_JSON_VALUE)
	 * public @ResponseBody List<User> findAllUserDetails() { return
	 * userRepo.findAll(); }
	 * 
	 * @PostMapping("/saveUser" ) public User saveUser(@RequestBody User user) {
	 * //String encodedPassword = pwdEncoder.encode(user.getPassword()); //
	 * user.setPassword(encodedPassword); User userresp = userRepo.save(user);
	 * return userresp; }
	 */

/*    @PostMapping("/login")
    public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest userRequest)
    {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                    userRequest.getUsername(), 
                    userRequest.getPassword()
                    )
            );
        String token=jwtUtil.generateToken(userRequest.getUsername());
        return ResponseEntity.ok(new UserResponse(token,"Success!, Generated By Suresh"));
    }*/
/* } */
