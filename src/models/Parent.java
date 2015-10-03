package models;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Role {
	
	private List<Student> childList = new ArrayList<Student>();
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setRoleList(Student child) {
		childList.add(child);
	}
	@Override
	public String toString() {
		return "Parent";
	}
}
