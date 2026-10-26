import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in); 
        
        
        // ask the rex to enter his name
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        // ask rex to enter his middle name
        System.out.print("Enter your middle name: ");
        String middlename = input.nextLine();
        
        // ask rex to enter his last name 
        System.out.print("Enter your last name : ");
        String lastname = input.nextLine();
        
        // ask rex to enter his age
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
       
        System.out.print("Your name:" + name);
        System.out.print("Your middle name:" + middlename);
        System.out.print("Your last name:" + lastname);
        System.out.print("Your age:" + age);
        
        }
        
        
          }
