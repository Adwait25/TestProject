package com.te.spring_validator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	@NotEmpty
	@Size(min = 2, message = "minimum 2 numbers")
	@Pattern(regexp = "[a-zA-Z]*", message = "it should only have alphabets")
	private String name;
	@NotEmpty
	@Email
	private String email;
	@Size(min = 4, max = 16)
	private String password;
}
