public class TwoDiamensionalArray{

	public static void main(String[] args) {
		
		int [][] matrix1 = new int [3][3];

		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				matrix1[i][j]=(int)(Math.random*10);
			}
		}
		// printing arrry elements

		for(int i=0;i<3;i++){
			System.out.println();
			for(int j=0;j<3;j++){
				System.out.print(matrix1[i][j]+" ");
			}
		}
		
	}
}