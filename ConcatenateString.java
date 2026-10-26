import java.util.Scanner;
public class ConcatenateString
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// ask rex to enter a name
		System.out.print("Jake: ");
		String name = input.nextLine();
		
		// ask rex to enter a name
		System.out.print("blue: ");
		String color = input.nextLine();
		
		// ask rex to enter a name
		System.out.print("dog: ");
		String animal = input.nextLine();
		
		// ask rex to enter a name
		System.out.print("hamburger: ");
		String food = input.nextLine();
		
		// we will now display the concatenated sentence
		System.out.println(" I had adream that " + name + " ate a ");
		System.out.println(color + " " + animal + " and said it tasted like " + food + "!");
	}
}
