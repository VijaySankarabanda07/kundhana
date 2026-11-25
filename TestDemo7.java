package dhruva;

public class TestDemo7 {
	static TestDemo7 t=new TestDemo7();
void method1() {
	method2(0)
	System.out.println("method1 is calling");
}
void method2() {
	System.out.println("method2 is calling");
}
static void method3() {
	t.method1();
}
	

	public static void main(String[] args) {
		
System.out.println("method is calling");
method3();


	
}
}


