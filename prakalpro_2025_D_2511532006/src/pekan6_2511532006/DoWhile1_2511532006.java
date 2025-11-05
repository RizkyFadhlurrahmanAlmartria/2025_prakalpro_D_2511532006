package pekan6_2511532006;
import java.util.Scanner ;

public class DoWhile1_2511532006 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String phrase;
		do {
			System.out.println("Input password");
			phrase = console.next();
		} while (!phrase.equals("abcd"));
	}

}
