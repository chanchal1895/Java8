package Interface.ex;

public class DefaultMehthodEx implements Left,Right {

	public void m() {
		System.out.println("Overriding m()");
		Left.super.m();
		Right.super.m();
	}
	public static void main(String [] args) {
		DefaultMehthodEx dm = new DefaultMehthodEx();
		dm.m();
		
	}
}

interface Left{
	default void m() {
		System.out.println("In Left default method");
	}
}

interface Right{
	default void m() {
		System.out.println("In Left Right method");
	}
}