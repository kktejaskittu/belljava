
import java.util.Scanner;
public class ReverseNumber {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
			Scanner kk;
			
				int Number, Reminder, Reverse = 0;
				Scanner scanner2 = kk = new Scanner(System.in);
				setScanner(scanner2);
				
				System.out.println("\n Please Enter any Number you want to Reverse : ");
				Number = kk.nextInt();
				
				while(Number > 0) {
					Reminder = Number %10;
					Reverse = Reverse * 10 + Reminder;
					Number = Number /10;
				}
				System.out.format("\n Reverse of entered number is = %d\n", Reverse);
	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		ReverseNumber.scanner = scanner;
	}
	
}
			 
			
			
	
	
	
