package pgm;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] array=new int[n][n];
		int value=1;
		int p=1;
		int q=n-1;
		int num=0;
		int num1=n-2;
		for(int i=0;i<n/2;i++){
			//forward
		    for(int j=num;j<p;j++){
		        for(int k=0;k<n;k++){
		        	array[j][k]=value++;
		        }
		    }
		    //backward
		        for(int l=q;l>num1;l--){
		            for(int m=0;m<n;m++){
		                array[l][m]=value++;
		            }
		        }
		        p++;
		        num1--;
		        num++;
		        q--;
		    }
		if(n%2==1){
			for(int i=n/2;i<=n/2;i++){
				for(int j=0;j<n;j++){
					array[i][j]=value++;
				}
			}
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(array[i][j]+" ");
		    }
		    System.out.println();
		}
	}

}
