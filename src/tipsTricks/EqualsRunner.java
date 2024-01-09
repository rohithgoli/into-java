package tipsTricks;

import java.util.Objects;

class Employee {
	private int id;
	
	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (getClass() != that.getClass())
			return false;
		Employee other = (Employee) that;
		return id == other.id;
	}
	
	
}

public class EqualsRunner {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		System.out.println(emp1.equals(emp2));
		
	}
}
