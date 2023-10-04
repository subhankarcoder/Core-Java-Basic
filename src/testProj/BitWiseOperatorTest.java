package testProj;

public class BitWiseOperatorTest {

	public static void main(String[] args) {
		int a = 5; //Binary of 5: 0101
		int b = 7; //Binary of 7: 0111
		int result = a & b; //After Bitwise AND operation: 0 AND 0 = 0, 1 AND 1 = 1, 0 AND 1 = 0....0101 => 5 (ans)
		System.out.println(result);
		int BitWiseZOR = a ^ b;
		System.out.println(BitWiseZOR); //same bit -> 0; Different bit -> 1...0010 => 2 (ans)
	}

}
