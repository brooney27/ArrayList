import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Books {

	public static void main(String[] args) {
		ArrayList<String> books = new ArrayList();
		
		Scanner in = new Scanner(System.in);
		String input = "";
		
		while(true){
			System.out.println("Enter book (done when finished): ");
			input = in.nextLine();
			if(input.equals("done"))break;
			books.add(input);
		}
		
		for (String book:books) {
		    System.out.println(book); 
		}
		
	}
}
