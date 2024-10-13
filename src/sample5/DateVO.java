package sample5;

public class DateVO {
	private String name;
	private String birth;
	@Override
	public String toString() {
		return "DateVO [name=" + name + ", birth=" + birth + "]";
	}
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}
