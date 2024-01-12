package tipsTricks;

public class RecordRunner {
	
	record Person(String name, String email, String phoneNumber) {
//		Person(String name, String email, String phoneNumber) {
//			if(name == null)
//				throw new IllegalArgumentException("Name is null");
//			this.name = name;
//			this.email = email;
//			this.phoneNumber = phoneNumber;
//		}
		
		Person {	// compact constructor --> ONLY allowed in records
					// static fields, methods, initializers can be added
					// instance variables cannot be added
					// instance methods can be added
			if(name == null)
				throw new IllegalArgumentException("name is null");
		}
	}
	
	public static void main(String[] args) {
		
		// Records --> eliminate verbosity in creating Java Beans
			// Public accessor methods, constructor, equals, hashcode & toString are automatically created
	
		Person person = new Person("Robert", "robert@email.com", "1342458748");
		
		Person samePerson = new Person("Robert", "robert@email.com", "1342458748");
		
		Person anotherPerson = new Person("John Doe", "john.doe@email.com", "9842451243");
				
		System.out.println(person);
		System.out.println(person.equals(samePerson));
		System.out.println(person.equals(anotherPerson));
		
		System.out.println(person.name());
		System.out.println(anotherPerson.email());
	}
	
}
