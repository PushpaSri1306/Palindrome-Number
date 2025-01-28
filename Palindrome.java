import java.util.*;
public class Palindrome {
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
		int b = reverse(n);
		System.out.println(b);
		if (n == b)
			System.out.println("Palindrome = Yes");
		else
			System.out.println("Palindrome = No");
            sc.close();
	}
    static int reverse(int n)
	{
		int b= 0;
		while (n > 0) {
			b = b * 10 + n % 10;
			n = n / 10;
		}
		return b;
	}
}

