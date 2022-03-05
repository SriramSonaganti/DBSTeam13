package com.backend.DBSBackend.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Table(name = "users")
@Entity
@Data
@ToString
@EqualsAndHashCode
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String username;


	private String email;


	private String password;
	

	private String phone;
	
	

    private Role roles;
	


}
