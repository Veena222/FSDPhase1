package Demo;
class parentclass{
	public void method1() {
		System.out.println("method1");
	}
}

class childclass extends parentclass{
	public void method2() {
		System.out.println("method2");
	}
}

public class sampleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childclass c2 = new childclass();
		c2.method1();

	}

}



