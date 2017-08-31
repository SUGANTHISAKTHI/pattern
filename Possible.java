package string;
import java.util.*;
public class Possible {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	
	String str=s.next();
	int n=str.length();
	int count=0;
	for(int i=0;i<n;i++){
		count++;
		System.out.println(str.charAt(i));
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			count++;
			System.out.println(str.charAt(i)+""+str.charAt(j));
		}
	}
for(int i=0;i<n;i++){
	for(int j=3;j<=n-i;j++){
		count++;
		System.out.println(str.substring(i,i+j));
	}
}
	System.out.println(count);

	
	}

}
