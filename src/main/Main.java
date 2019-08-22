package main;

/**
 * @author Sajal
 * @version 1.0
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
    System.out.println("Welcome, "+name+"!");
    System.out.println("ho gaya");
    Scanner.close();

    }
}
