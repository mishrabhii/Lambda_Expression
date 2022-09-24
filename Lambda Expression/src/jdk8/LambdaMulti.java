package jdk8;

@FunctionalInterface
interface Multiplication{
	void multi(int a,int b);
}

public class LambdaMulti {

	public static void main(String[] args) {
		Multiplication op = (num1 , num2)->{
			int res = num1 * num2;
			System.out.println("Result: "+res);
		};
		op.multi(2, 5);

	}
}
