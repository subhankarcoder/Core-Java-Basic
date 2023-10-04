package testProj;

public class OperatorsTest {

	public static void main(String[] args) {
		int a = 15;
		int i=1;
		do {
			System.out.println("Hello Count: " + i);
			i++;
			a++;
		}while(a<20);
		
		if(a>18 && a<20) {
			System.out.println("Some nonsense logic was called!");		
		}else {
			System.out.println("LOGIC FAILED!!");
		}
		switch(a) {
		case 1:
			System.out.println("Case 1 called");
			break;
		case 20:
			System.out.println("Case 2 called");
			break;
		default:
			System.out.println("Invalid Case");
		}

	}

}
