package Program_3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
		boolean PasswordOK=false;

		while(!PasswordOK){
			System.out.println("Utwórz hasło");
			String haslo = scanner.nextLine();
			
        if (haslo.length() <= 8) {
            System.out.println("Twoje hasło jest za krótkie.");
        } else {
            System.out.println("Twoje hasło jest w porządku.");
			PasswordOK=true;
        }
    }
    }
}
