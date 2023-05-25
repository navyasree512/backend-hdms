package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Doctormodel {
	
		@Entity
		@Table(name = "doctor")
		public class Doctor {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private long id;

			@Column(name = "first_name", nullable = false)
			private String firstname;

			@Column(name = "last_name", nullable = false)
			private String lastname;

			@Column(name = "email", nullable = false)
			private String email;

			@Column(name = "password", nullable = false)
			private String password;

			@Column(name = "Designation", nullable = false)
			private long Designation;

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getFirstname() {
				return firstname;
			}

			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}

			public String getLastname() {
				return lastname;
			}

			public void setLastname(String lastname) {
				this.lastname = lastname;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public Object getDesignation() {
				// TODO Auto-generated method stub
				return null;
			}

			public void setDesignation(Object Designation) {
				
				// TODO Auto-generated method stub
				
			}
		}
	}



