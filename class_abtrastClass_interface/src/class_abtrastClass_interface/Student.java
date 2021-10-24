package class_abtrastClass_interface;

public class Student extends Person implements Tax {
	String name;
	String studentId;
	String email;
	String phone;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Student(String birthday, char blood_type, int gender) {
		super(birthday, blood_type, gender);
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
	
	public double payTax(double income, String startTime, String endTime) {
		if(income > 11000000)
			return income * 0.005;
		return 0;
	}
}
