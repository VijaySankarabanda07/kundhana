package dhruva;

public class Methodprogram {
	static{
		System.out.println("hello vijay");
	}
	
static void method1(){
method5();
	System.out.println("method1 is calling");
	
}
void method4(){
	method2();
	System.out.println("method4 is calling");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodprogram M=new Methodprogram();
System.out.println("method is starting");
M.method3();
System.out.println("method is ending");
	}
void method2(){
	method1();
	System.out.println("method2 is calling");
	
	
}
void method3(){
	method4();
	System.out.println("method3 calling");
	}
static void method5(){
	System.out.println("method5 is calling");

}


}
