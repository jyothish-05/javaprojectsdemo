package vcubeprojects;

public class TaskMethods {
	static void method1() {
		System.out.println("method1 clled");
	}
	 void method2() {
		 method1();
		System.out.println("method2 clled");
		method3();
		method4();
		method5();
	}
	static void method3() {
		System.out.println("method3 clled");
	}
	 void method4() {
		System.out.println("method4 clled");
	}
	static void method5() {
		System.out.println("method5 clled");
	}


	public static void main(String[] args) {
		TaskMethods m2 = new TaskMethods();
		m2.method2();
		

	}

}
