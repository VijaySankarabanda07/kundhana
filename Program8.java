package dhruva;

public class Program8 {
	int number;
	String name;
	int batch;
	String mobile;
	String collegename;
	static Program8 p=new Program8();
	void method1(){
		System.out.println("instance method1 is calling");
		
	}
	void method2(){
		System.out.println("instance method2 is calling");
		System.out.println("number is: "+ p.number);
		System.out.println("name is = "+ p.name);
		System.out.println("batch is: "+p.batch);
		System.out.println("mobile is = "+ p.mobile);
		System.out.println("collegename is "+p.collegename);
		
		
	}
	static void method3() {
		p.number=1;
		p.name="vijay";
		p.batch=7;
		p.mobile="8886378337";
		p.collegename="gates";
		
		p.method2();
	}

	public static void main(String[] args) {
		p.method3();
System.out.println("static method is calling");

	}

}
