package pattern;
import java.util.*;
public class pattern3 {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=n;
		for(int i=0;i<n;i++){
			for(int j=1;j<=m;j++){
				System.out.print(j+" ");
			}
			m--;
			System.out.println();
		}

	}

}
