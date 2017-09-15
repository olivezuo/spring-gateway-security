package com.jin.auth.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "users")

public class Users implements Serializable{

	private static final long serialVersionUID = -2738505139650491019L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "user_name", nullable = false)
	private String userName;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = true)
	private String email;

	@Column(name = "active", nullable = false)
	private boolean active;

	@ManyToMany
	@JoinTable(
      name="users_groups",
      joinColumns=@JoinColumn(name="user_id", referencedColumnName="id", foreignKey = @ForeignKey(name = "FK_USER")),
      inverseJoinColumns=@JoinColumn(name="group_id", referencedColumnName="id"))
	private List<Groups> groups;

}
