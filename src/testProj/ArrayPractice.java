package testProj;

public class ArrayPractice {

	public static void main(String[] args) {
		int[][] twoDarray = {{2,3,5},{7,8,9},{1,3,8}};
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(twoDarray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
