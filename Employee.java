package dhruva;

public class Employee {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("final");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee ();//@27716f4
		Employee E2=new Employee ();//@8efb846
		Employee E3=new Employee ();//@2a84aee7
		System.out.println(E1);
		System.out.println(E2);
		System.out.println(E3);
E1=null;
System.out.println(E1);
E2=E3;
System.out.println(E3);
System.out.println(E2);
System.gc();


	}

}
