
class StudentCap {
	int rollno;
	String name;
	
	// Getters and Setters;
	
	public void setRollno(int r) {
		rollno = r;
	}
	
	public int getRollno() {
		return rollno;
	}
}

public class EncapsulationDemo {
	public static void main(String args[]) {
		
		StudentCap s0 = new StudentCap();
		
		s0.setRollno(100);
		System.out.println(s0.getRollno());		
	}
}
