package models;

public class driverTest {

	public static void main(String[] args) {
		Person me = new Person();
		Student student = new Student();
		Parent parent = new Parent();
		Counselor counselor = new Counselor();
		Staff staff = new Staff();
		
		parent.setRoleList(student);
		
		me.setRoleList(student);
		me.setRoleList(parent);
		me.setRoleList(counselor);
		me.setRoleList(staff);
		me.roleListToString();
		
		
		
	}

}
