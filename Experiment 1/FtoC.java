//Monish rao
//24csu321
import java.util.Scanner;
class FtoC{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Monish Rao,rollno. = 24csu321 ");
		System.out.print("\nEnter Temperature = ");
		int a = sc.nextInt();
		float c = (a-32)*(5f/9f);
		System.out.print("Temperature in celsius = "+c);
	}
}