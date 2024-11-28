package MethodReference;

import java.util.function.BiPredicate;

public class MethodReferenceEx1 {
	public boolean m1(int i,int j) {
		if(i%2==0) {
			return false;
		}else 
			return true;
	}
	public static void main(String args[]) {
		MethodReferenceEx1 t =  new MethodReferenceEx1();
		BiPredicate<Integer,Integer> p = t::m1;
		System.out.println(p.test(6,9));
		
		
		
	}

}
