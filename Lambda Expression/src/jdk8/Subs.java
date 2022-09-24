package jdk8;

@FunctionalInterface
interface Substraction{
	void subs(int a,int b);
}

public class Subs {

	public static void main(String[] args) {
		Substraction op = (num1 , num2)->{
			int res = num1 - num2;
			System.out.println("Result: "+res);
		};
		op.subs(10, 5);

	}
}
