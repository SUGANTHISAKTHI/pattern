package pattern;
import java.util.*;
public class pattern10 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int space1=1,space2=n-2;
	int m=2;
	int p=n-1;
	for(int i=1;i<=n;i++){
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=1;i<n;i++){
		for(int sp=1;sp<=space1;sp++){
			System.out.print(" ");
		}
		for( int j=m;j<=n;j++){
			System.out.print(j+" ");
		}
		m++;
		space1++;
		System.out.println();
	}
	for(int i=2;i<n;i++){
		for(int sp=1;sp<=space2;sp++){
			System.out.print(" ");
		}
		for(int j=p;j<=n;j++){
			System.out.print(j+" ");
		}
		System.out.println();
		space2--;
		p--;
	}
	for(int i=1;i<=n;i++){
		System.out.print(i+" ");
	}
	
	}

}
