package pattern;
import java.util.*;
public class pattern9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			int p=i-1;
			//System.out.print(p);
			for(int k=p;k>=1;k--){
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
