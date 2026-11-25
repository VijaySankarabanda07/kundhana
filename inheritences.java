package dhruva;

public class inheritences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Parent { // Parent / Super / Base Class
		    String surname = "Kumar";
		    void bike() {
		        System.out.println("Parent has a bike");
		    }
		}

		class Child extends Parent { // Child / Sub / Derived Class
		    void study() {
		        System.out.println("Child is studying");
		    }
		}

		// Main lo
		Child c = new Child();
		System.out.println(c.surname); // Kumar - Parent nunchi vachindhi
		c.bike(); // Parent nunchi vachindhi
		c.study(); // Child thana sontham
	}

}
