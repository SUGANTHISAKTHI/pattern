package pattern;
import java.util.*;
public class pattern8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=n;
		for(int i=1;i<=n;i++){
			for(int j=n;j>=m;j--){
				System.out.print(j+" ");
			}
			System.out.println();
			m--;
		}

	}

}
