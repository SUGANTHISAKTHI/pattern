package pattern;
import java.util.*;
public class pattern13 {
public static void main(String[] args) {
	Scanner s=new  Scanner(System.in);
	int n=s.nextInt();
	int m=0;
	for(int i=0;i<n;i++){
		System.out.print("0"+" ");
	}
	System.out.println();
	for(int i=1;i<n;i++){
		for(int j=0;j<n;j++){
			if(j==i){
				System.out.print(i+" ");
			}else{
				System.out.print("0"+" ");
			}
			
		}
		m++;
		System.out.println();
	}

	}

}
