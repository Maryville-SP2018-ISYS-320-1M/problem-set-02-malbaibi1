import java.util.Scanner;

/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 15-4-2018 
*/

public class P4_L337Sp34k3r {

public static void main(String[] args)
{
  String str1, str2 = " ", out1, out2, out3;
  System.out.println("L337 Translator");
  System.out.print("Please enter your three words to make L334: ");
  Scanner scn = new Scanner(System.in);
  str1 = scn.nextLine();
  
    int n1 = str1.indexOf(str2);                 //seperate each word of user string
    String s1 = str1.substring(0,n1);
    String str3 = str1.substring(n1+1);
    int n2 = str3.indexOf(str2);
    String s2 = str3.substring(0,n2);
    String s3 = str3.substring(n2);
  
    out1 = action1337(s1);
    out1 = out1.toUpperCase();
    System.out.println(s1+ " -> " +out1);
  
    out2 = action1337(s2);
    out2 = out2.toUpperCase();
    System.out.println(s2+ " -> " +out2);
  
    out3 = action1337(s3);
    out3 = out3.toUpperCase();
    System.out.println(s3+ " -> " +out3);
}
 public static String action1337(String str)   // method to convert english into leet
{
  str = str.replace('A', '4');
  str = str.replace('a', '4');
  
  str = str.replace('E', '3');
  str = str.replace('e', '3');

  str = str.replace('T', '7');
  str = str.replace('t', '7');

  str = str.replace("O", "()");
  str = str.replace("o", "()");
  
  return str;
}
}