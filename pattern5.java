package pattern;
import java.util.*;
public class pattern5 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=n;i++){
		if(i%2==1){
			for(int j=1;j<=n;j++){
				if(j%2==1){
					System.out.print("1"+" ");
				}else{
					System.out.print("0"+" ");
				}
			}System.out.println();
		}else if(i%2==0){
			for(int k=1;k<=n;k++){
				if(k%2==1){
					System.out.print("0"+" ");
				}else{
					System.out.print("1"+" ");
				}
			}
			System.out.println();
		}
	}
	}

}
