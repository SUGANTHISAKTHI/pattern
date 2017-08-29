package pattern;
import java.util.Scanner;
public class sprialreverse {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] array=new int[n][n];
		int size=n*n;
	    int value=n*n;
	    int row=0;
	    int row1=0;
	    int column=n-1;
	    int column1=n-1;
	    while(value!=0){
	    	for(int i=row1;i<=column;i++){
	    		array[row][i]=value;
	    		value--;
	    	}
	    	for(int j=row+1;j<=column;j++){
	    		array[j][column1]=value;
	    		value--;
	    	}
	    	for(int k=column1-1;k>=row;k--){
	    		array[column][k]=value;
	    		value--;
	    	}
	    	for(int l=column1-1;l>=row+1;l--){
	    		array[l][row]=value;
	    		value--;
	    	}
	    	column--;
	    	row++;
	    	row1++;
	    	column1--;
	    	
	    }
		
	    for(int i=0;i<n;i++){
	    	for(int j=0;j<n;j++){
	    		System.out.print(array[i][j]+" ");
	    	}
	    	System.out.println();
	    }


	}

}
