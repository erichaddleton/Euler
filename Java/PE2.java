package Java;

public class PE2 {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i < 4000000; i+=(i-1)) {
			if (i%2 == 0)
				sum += i;
		}
		
		System.out.println(sum);

	}

}
