package sample7;

public class Engineer extends Emp{
	private String dept;
	
	public Engineer() {
	}
	public Engineer(String name, int salary) {
		super(name, salary);
	}
	@Override
	public String toString() {
		return super.toString() + "부서 : " + dept + "(기술부)";
	}
	//	getter / setter
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
