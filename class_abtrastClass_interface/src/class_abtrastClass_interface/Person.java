package class_abtrastClass_interface;

public abstract class Person {
	String birthday;
	char blood_type;
	int gender;
	//method
	//constructor
	public Person(String birthday, char blood_type, int gender) {
		this.birthday = birthday;
		this.blood_type = blood_type;
		this.gender = gender;
	}
	
	abstract String getBirthday();
	abstract void setBirthday(String birthday);
	abstract char getBlood_type();
	abstract void setBlood_type(char blood_type);
	abstract int getGender();
	abstract void setGender(int gender);
}
