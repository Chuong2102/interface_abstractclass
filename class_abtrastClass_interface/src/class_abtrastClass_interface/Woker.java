package class_abtrastClass_interface;

class Worker extends Person implements Tax{
	
	String name;
	int citizenId;
	String phone;
	String email;
	double salary;
	double other_income;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getOther_income() {
		return other_income;
	}

	public void setOther_income(double other_income) {
		this.other_income = other_income;
	}

	public Worker(String birthday, char blood_type, int gender) {
		super(birthday, blood_type, gender);
	}
	
	public double payTax(double income, String startTime, String endTime) {
		if(income > 15000000)
			return income * 0.01;
		return 0;
	}
	
	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public char getBlood_type() {
		return this.blood_type;
	}
	public void setBlood_type(char blood_type) {
		this.blood_type = blood_type;
	}
	public int getGender() {
		return this.gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

}
