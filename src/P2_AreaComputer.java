/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 15-4-2018 
*/

public class P2_AreaComputer {

 public static void main(String[] args) {
   double area = triangleArea( 8, 5.2, 7.1);              // calling method
   System.out.printf("sqrt is %.15f%n", Math.sqrt(area));

 }
     public static double triangleArea(double a,double b, double c) {  // mthod for comuting area
       double s = (a+b+c)/2;
       double value = s*(s-a)*(s-b)*(s-c);                //implementation formula
     return value;

}

}