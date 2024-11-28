package Interface.ex;

import java.util.function.Function;

public class FunctionChainingEx
{
	public static void main(String []args) {
		
		Function<Integer,Integer> f1 = i->2*i;
		Function<Integer, Integer> f2 = i->i*i*i;
		
		//andThen----f1 will apply resulting 3*2=6 and the f2 will apply resulting 6*6*6=216
		System.out.println(f1.andThen(f2).apply(3));
		
		//compose---f2 will apply first so 4*4*4=64 and the f1 64*2=128 then again f1=128*2=256
		System.out.println(f1.compose(f2).andThen(f1).apply(4));
	}
}
