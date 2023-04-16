import java.util.*;
public class Add_two_matrices {
	public static double[][] addMatrices(double[][] M1,double[][] M2,int m,int n){
		double[][] res=new double[m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				res[i][j]=M1[i][j]+M2[i][j];
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input the size of matrices");
		System.out.println("The number of rows:");
		int rows=sc.nextInt();
		while (rows<=0) {
			System.out.println("The number of rows:");
			rows=sc.nextInt();
		}
		System.out.println("The number of columns:");
		int cols=sc.nextInt();
		while(cols<=0) {
			System.out.println("The number of columns:");
			cols=sc.nextInt();
		}
		double[][] M1=new double[rows][cols];
		double[][] M2=new double[rows][cols];
		System.out.println("Please input the value of entries of matrix M1:");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				M1[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Please input the value of entries of matrix M2:");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				M2[i][j]=sc.nextDouble();
			}
		}
		sc.close();
		double[][] res=addMatrices(M1,M2,rows,cols);
		System.out.println("The result matrix is: ");
		for (int i=0;i<rows;i++) {
			for (int j=0;j<cols;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}