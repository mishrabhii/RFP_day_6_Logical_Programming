package perfectNumberWithUserInput;
import java.util.Scanner;

public class Perfect {
	public static boolean checkPerfectNumber(int num) {

		boolean result = false;

		int sum=0, i=1;

		while(i<=num/2) {

			if(num % i == 0) {

				sum = sum + i;
			}

			i++;
		}

		if(sum==num) {

			result=true;

		}

		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter The Number :: ");

		int num = sc.nextInt();

		boolean result = checkPerfectNumber(num);

		boolean value = true;


		if(result==true) {

			System.out.println("The given number is Perfect Number..!!");

		}else {

			System.out.println("The given number is not a Perfect Number..!!");

			while(value) {

				Scanner sc1 = new Scanner(System.in);

				System.out.println("Please Enter The Number Again :: ");

				int anotherNum = sc.nextInt();

				boolean anotherResult = checkPerfectNumber(anotherNum);

				if(anotherResult == true) {

					System.out.println("The given number is Perfect Number..!!");

					value=false;

					break;

				}else {

					System.out.println("The given number is not a Perfect Number..!!");

					continue;

				}
			}
		}
	}
}


