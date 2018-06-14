package domain;

public class Salary {
	public static final String DEPT = "인턴쉽";
	String dept, name;
	int sal;

	public Salary(String name, int sal) {
		setName(name);
		this.sal = sal;
		setDept(DEPT);
	}
	public Salary() {
		
	}
	public void setSal(int sal) {
		
	}
	public void setName(String name) {
		this.name =name.substring(0,1);
	}
	public void setDept(String dept) {
		this.dept = dept.substring(0,2);
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
	public int getSal() {
		return sal;
	}
	public String toString() {
		return String.format("%s%s에게 %d원 지급", name, dept, sal);
	}
}
