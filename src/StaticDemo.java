
class Emp {
	int eid;
	int salary;
	static String ceo;
	
	static {	// when class is loaded
		ceo = "Senapati";
		System.out.println("in static");
	}
	
	public Emp() {	// when object is created
		eid = 3;
		salary = 3000;
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}

public class StaticDemo {
	public static void main(String args[]) {
		Emp ramu = new Emp();
//		ramu.eid = 3;
//		ramu.salary = 5000;
//		ramu.ceo = "Senapati";
//		Emp.ceo = "Senapati";
		
		Emp somu = new Emp();
//		somu.eid = 7;
//		somu.salary = 6000;
//		somu.ceo = "Senapati";
		
//		Emp.ceo = "Ruther Ford";
		
		ramu.show();
		somu.show();
	}
}
