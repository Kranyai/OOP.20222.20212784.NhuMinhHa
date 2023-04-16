import java.util.*;
public class Numeric_Array {
	public static double[] sortArray(double[] arr) {
		double[] res=new double[arr.length];
		int count,a;
		double num;
		for(int i=0;i<arr.length;i++) {
			count=0;
			num=arr[i];
			a=1;
			for (int j=0;j<arr.length;j++) {
				if(arr[j]>num) {
					count++;
				}
			}
			while(res[arr.length-count-a]==num) {
				a++;
			} 
			res[arr.length-count-a]=num;
		}
		return res;
	}
	public static double sumArray(double[] arr) {
		double sum=0;
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static double averageArray(double[] arr) {
		return (double)sumArray(arr)/arr.length;
	}
	public static void showArray(double[] arr) {
		System.out.print("Numeric Array: ");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");;
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the size of array:");
		int n=sc.nextInt();
		while(n<=0) {
			System.out.println("Input the size of array:");
			n=sc.nextInt();
		}
		System.out.println("Input the array:");
		double[] arr=new double[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextDouble();
		}
		sc.close();
		arr=sortArray(arr);
		showArray(arr);
		System.out.println("Sum of Array: "+sumArray(arr));
		System.out.println("Average of Array: "+averageArray(arr));
	}
}