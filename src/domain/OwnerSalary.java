package domain;

public class OwnerSalary extends StaffSalary{
	public static final String DEPT= "이사회";
	protected int share; // (sal + bonus) * 10
	public OwnerSalary(String name, String sal) { //name sal은 컨트롤 누르고 staffsalary 누른다음 가서 긁어와라. 외우는게 아냐
		super(name,sal);
		setDept(DEPT);
		setBonus();
		setShare();
	}
	public void setDept(String dept) {
		this.dept = dept.substring(0,2);
	}
	public void setShare() {
		share=(sal+bonus)*10;
	}
	public int getShare() {
		return share;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return String.format("%s%s에게 %d원을 지급",name,dept,sal+bonus+share);
	}
}
