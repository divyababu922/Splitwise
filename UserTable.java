package com.splittter.jpa.domains;

import javax.persistence.*;

@Entity
@Table(name = "usertable")
public class UserTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String uname;
	private int owes;
	private int owed;

	public UserTable() {

	}

	public UserTable(String uname, int owes, int owed) {
		this.uname = uname;
		this.owes = owes;
		this.owed = owed;

	}
}