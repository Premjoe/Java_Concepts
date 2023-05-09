package Method_In_Java;

public class MainMethod {

	int a;
	int b;

	public static void main(String[] prem) {
		// TODO Auto-generated method stub

		MainMethod obj = new MainMethod();
		int n = obj.a = 10;

		obj.b = 23;

		System.out.println(n);

	}

}
