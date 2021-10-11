
public class Operators {

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 30;
		int num3 = 50;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
		
		
		
		
		int my_num1 = 10;
		System.out.println(my_num1);
		my_num1 += 5;
		System.out.println(my_num1);
		
		int my_num2 = 100;
		System.out.println(my_num2);
		my_num2 /= 5;
		System.out.println(my_num2);
		
		int my_num3 = 50;
		System.out.println(my_num3);
		my_num3 *= 5;
		System.out.println(my_num3);
		
		int my_num4 = 30;
		System.out.println(my_num4);
		my_num4 -= 5;
		System.out.println(my_num4);

	}

}
