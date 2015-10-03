package models;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	private Contact contact;
	private List<Role> roleList = new ArrayList<Role>();
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	public void roleListToString() {
		System.out.print(roleList.toString());
	}
	public void addRoleList(Role role) {
		roleList.add(role);
	}
	
}
