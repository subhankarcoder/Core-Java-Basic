package testProj;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		int a = 10;
		System.out.println("The integer is " + a);
		if(a>5) {
			a++;
			System.out.println("The increamented value is " + a);
			System.out.println("The increamented value1 is " + ++a);
			System.out.println("The increamented value2 is " + a++);
		}
		int[] numbers = {1,2,3,4,5};
		for(int item : numbers) {
			System.out.print(item + " ");		
		}
	}
}
