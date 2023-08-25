package labb2;

public class Mypkg {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int diff(int a, int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		Mypkg mp = new Mypkg();
		int x = mp.add(2, 3);
		System.out.println("Sum is: " + x);
		int y = mp.diff(4, 1);
		System.out.print("Diff is: " + y);
	}

}
