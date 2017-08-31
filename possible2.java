package string;
import java.util.*;
public class possible2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int n=str.length();
	char ch=str.charAt(n-1);
	int count1=0;
	for(int i=0;i<n;i++){
		count1++;
		System.out.println(str.charAt(i));
	}
	int size=1;
	int count=1;
	int y=1;
	while(n!=count){
		int x=1;
	for(int i=0;i<n-size;i++){
				int num=i+x;
		int n1=num+y;
		int m=0;
		int p=i;
		while(n!=m){
		String str1=str.charAt(i)+str.substring(num,n1);
		count1++;
		System.out.println(str1);
		int len=str1.length();
		char ch1=str1.charAt(len-1);
		if(ch==ch1){
			m=n;
		}
		num++;
		n1++;
			
		}
	}
count++;
	
	x++;
	y++;
	size++;
	}
	System.out.println(count1);
}

}
