public class Programmer {
	private int id;
	private String fname;
	private String lname;
	private int salary;
	private String employer;
	private String jobTitle;

	public Programmer(){}
	public Programmer(int id, String fname, String lname, int salary, String employer, String jobTitle) {
		this.id = id;
		this.fname = fname;
		this.salary = salary;
		this.employer = employer;
		this.jobTitle = jobTitle;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getFname(){
		return this.fname;
	}

	public void setFname(String fname){
		this.fname = fname;
	}

	public String getLname(){
		return this.lname;
	}

	public void setLname(String lname){
		this.lname = lname;
	}

	public int getSalary(){
		return this.salary;
	}

	public void setSalary(int salary){
		this.salary = salary;
	}

	public String getEmployer(){
		return this.employer;
	}

	public void setEmployer(String employer){
		this.employer = employer;
	}

	public String getJobTitle(){
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle){
		this.jobTitle = jobTitle;
	}
}
