import java.util.Objects;

public class Subject {
	String name;
	int subjectCode;
	
	public Subject(String name, int subjectCode) {
		this.name = name;
		this.subjectCode = subjectCode;
	}
	
	@Override
	public String toString() {
		return "Subject{" +
				"name='" + name + '\'' +
				", rollNo=" + subjectCode +
				'}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(subjectCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return subjectCode == other.subjectCode;
	}
}
