package inheritance;

public class Customer {
	private String name;
	private int id;
	private long aadharno;
	private  long phoneno;
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", aadharno=" + aadharno + ", phoneno=" + phoneno + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
