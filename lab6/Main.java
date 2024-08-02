package lab6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(97000, "Sameer", 3.51);
		 Student s2 = new Student(98000, 3.22);
		 Undergrad u1 = new Undergrad(99000, "Shahid", 2.91, "Junior");
		 Graduate g1 = new Graduate(200000, "Mubin", 3.57,
		"Algorithms and Complexity");

		 System.out.print(s1);
		 System.out.print(s2);
		 System.out.print(u1);
		 System.out.print(g1); 

	}

}
