package class_abtrastClass_interface;

public class taxmanagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("21-02-2002", 'A', 0);
		Worker worker = new Worker("02-01-2002", 'O', 0);
		BusinessPerson bus = new BusinessPerson("10-09-2002",'B', 1);
		
		student.setName("Chuong");
		student.setStudentId("20T1080026");
		student.setGender(0);
		
		worker.setName("Hieu");
		worker.setGender(0);
		worker.setSalary(1000000);
		worker.setOther_income(200000);
		
		bus.setName("Hoa");
		bus.setGender(1);
		bus.setSalary(50000000);
		bus.setOther_income(1000000000);
		bus.setBusiness_income(20000000);
		
		//
		System.out.println(student.getName());
		System.out.println(student.payTax(3000000, "11-11-2021", "11-12-2021"));
		System.out.println(worker.getName());
		System.out.println(worker.payTax(worker.getSalary() + worker.getOther_income(), "11-11-2021", "11-12-2021"));
		System.out.println(bus.getName());
		System.out.println(bus.payTax(bus.getSalary() + bus.getOther_income() + bus.getBusiness_income(), "11-11-2021", "11-12-2021"));
	}

}
