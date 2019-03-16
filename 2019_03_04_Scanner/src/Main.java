import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		consoleGame(3);
	}
	
	public static void consoleGame( int quantityTry) {
		Scanner scanner = new Scanner(System.in);
		int myNum =(int) Math.floor(Math.random() * 100);
		int count = 0;
		int number;
		do {
			count++;
			System.out.println("Enter your number: ");
			number = scanner.nextInt();
			if(number == myNum) {
				System.out.println("You win");
				break;
			}
			if(number<myNum && (quantityTry-count)!=0) {
				System.out.println("No, your number is smaller, try again. You have "+(quantityTry-count)+ " attempts left");
			}
			if(number>myNum && (quantityTry-count)!=0) {
				System.out.println("No, your number is bigger, try again. You have "+(quantityTry-count)+ " attempts left");
			}
			if (number!=myNum && (quantityTry-count)==0) {
				System.out.println("You lose because your attempts is ended");
			}
			if(count==quantityTry) {
				break;
			}
		} 
		while (number!=myNum);
		}
	
	}
