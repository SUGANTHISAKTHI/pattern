package pattern;
import java.util.*;
public class pattern7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=n;
		int p=1;
		for(int i=1;i<=n;i++){
			for(int j=m;j>=p;j--){
				System.out.print(j+" ");
			}
			System.out.println();
			p++;
		}

	}

}
