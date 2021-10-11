
public class TypeCasting {

	public static void main(String[] args) {		
		// automatic / widening

		short old_age = 20;
		int new_age = old_age;
		System.out.println(old_age);
		System.out.println(new_age);
		
		int salary = 10000;
		double new_salary = salary;
		System.out.println(salary);
		System.out.println(new_salary);
		
		// byte number = 5;
		// number * // 50000
		
		
		// narrowing / explicit
		
		int cash = 2000000;
		short new_cash = (short) cash;
		System.out.println(cash);
		System.out.println(new_cash);
		
		// explicit type casting
		float num = 20.95f;
		int my_num = (int) num;
		System.out.println(num);
		System.out.println(my_num);
	}

}
