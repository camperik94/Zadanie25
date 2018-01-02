import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj 1 wyraz");
		
		String wyraz1 = in.nextLine();
		
		System.out.println("Podaj 2 wyraz");
		
		String wyraz2 = in.nextLine();
		
		Palindrom pal = new Palindrom(wyraz1, wyraz2);
		
		System.out.println(pal.czyPalindrom());
	}
}
