package models.users;

import java.util.*;
import javax.persistence.*;
import play.data.format.*;
import play.data.validation.*;
import com.avaje.ebean.*;

@Entity
// This is a User of type manager

@DiscriminatorValue("manager")

// Manager inherits from the User class
public class Manager extends User {
	
	private String department;

	public Manager() {

	}
	public Manager(String email, String role, String name, String password, String department)
	{
		super(email, role, name, password);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}