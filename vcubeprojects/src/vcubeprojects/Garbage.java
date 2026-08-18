package vcubeprojects;

public class Garbage {
	
	@Override
	protected void finalize() {
		System.out.println("finalize called");
	
	}

	public static void main(String[] args) {
		Garbage g1 = new Garbage();//27716f4

		
		Garbage g2 = new Garbage();
		System.out.println(g2);
		
		Garbage g3 = new Garbage();
		System.out.println(g3);
		
		g1 = g3;
		System.gc();
		System.out.println(g1);

	}

}
