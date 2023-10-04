package testProj;
import java.util.List;
import java.util.ArrayList;


public class ArrayListPractice {

	public static void main(String[] args) {
		List<Integer> ArrayList = new ArrayList<Integer>();
		ArrayList.add(5);
		ArrayList.add(8);
		ArrayList.add(3);
		ArrayList.add(6);
		System.out.println("Default Represntation: " + ArrayList);
		for(int data : ArrayList) {
			System.out.print(data + " ");
		}
		System.out.println();
		int firstElement = ArrayList.get(0); //Calling by index number
		System.out.println("The number called is: " + firstElement);
		int capacity = ArrayList.size();
		System.out.println("The capacity of ArrayList is: " + capacity);
		}

}
