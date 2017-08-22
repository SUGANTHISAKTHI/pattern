package pattern;
import java.util.*;
public class pattern4 {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int j=0;
		for(int i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				if(i==j){
					for(int k=i;k<=n;k++){
						System.out.print(k+" ");
					}
				}else{
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(j=1;j<=n;j++){
				if(i==j){
					for(int k=i;k<=n;k++){
						System.out.print(k+" ");
					}
				}
				else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}
