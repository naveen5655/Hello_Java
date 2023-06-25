package naveen;

public class myMainCalc {

	public static void main(String[] args) {
		MyCalc c = new MyCalc();
		System.out.println("sum="+c.sum(2, 5));
		System.out.println("sub="+c.sub(2, 5));
		System.out.println("mul="+c.mul(2, 5));
		System.out.println("div="+c.div(10, 5));
		c.greeting();
	}

}
