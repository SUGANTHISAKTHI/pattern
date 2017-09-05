package pgm;
import java.util.*;
public class anagram {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str1=s.nextLine();
	String str2=s.nextLine();
	int len=str1.length();
	int count=0;
	char[] array=new char[str2.length()];
	for(int i=0;i<str2.length();i++){
		array[i]=str2.charAt(i);

		
	}
	for(int i=0;i<len;i++){
		char ch1=str1.charAt(i);
for(int j=0;j<array.length;j++){
	char ch2=array[j];
	if(ch1==ch2){
		count++;
		array[j]=' ';
		break;
	}
}

	}
	if(count==len){
		System.out.println("anagram");
	}else{
		System.out.println("not anagram");
	}
	
	}

}
