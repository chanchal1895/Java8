package Interface.ex;

import java.util.Date;
import java.util.function.Supplier;
import java.util.regex.Matcher;

public class SupplierEx {

	public static void main(String[] args)  
	{
		Supplier<Date> s =() ->new Date();
		System.out.println(s.get());
		
		//gererate otp of 6 digit
		
		Supplier<String> supOtp = ()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(supOtp.get());
	}
}
