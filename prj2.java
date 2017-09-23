package prj01;
import java.util.*;
public class prj2 {
	
	public static void main(String[] args){
		System.out.print("请输入数组阶数：");
		int N;
		Scanner n1 = new Scanner(System.in);
		N = n1.nextInt();
		int n,i,j,m=1;
		int [][] a= new int [N][N];
		for(n=0;n<=N/2;n++){
			for(j=n;j<N-n;j++)
			a[j][n]=m++;
			for(i=n+1;i<N-n;i++)
			a[N-n-1][i]=m++;
			for(j=N-n-2;j>=n;j--)
			a[j][N-n-1]=m++;
			for(i=N-n-2;i>n;i--)
			a[n][i]=m++;
		}for(i=0;i<N;i++){
			for(j=0;j<N;j++)
			System.out.print(" "+a[i][j]+" ");
			System.out.print("\n");
		}
	}
}