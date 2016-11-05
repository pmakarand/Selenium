package AutomationFramework;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {
		int input=343,remainder,div;
		remainder = input%10;
		div=input/10;
		System.out.println(remainder);
		System.out.println(div);
		int a[]={1,2,3,4,5,6,7};
		int b[]={1,3,4,5,6,7};
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		for(int num:a)
			set1.add(num);
		
		for(int num:b)
			set2.add(num);
		
		set1.removeAll(set2);
		System.out.println(set1);
			
		

	}
}
