import java.util.Scanner;

/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 15-4-2018 
*/

public class P3_YouAndYourAge {

 public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
     System.out.print("What is your name?");
     String name = console.nextLine();
     System.out.print("And how old are you?");
     int age = console.nextInt();
     System.out.println("Wow " + name +", you've been alive " + age + " years? Amazing.");

 }

}