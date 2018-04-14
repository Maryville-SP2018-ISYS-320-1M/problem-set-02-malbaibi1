import java.util.Scanner;

/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 15-4-2018
*/

public class P5_StairMaster {

 public static void main(String[] args) {
   
  System.out.print("How many stairs in your staircasse? ");
  Scanner scn = new Scanner(System.in);
  int num = scn.nextInt();
  
  System.out.print("How wide should each stair be? ");
  int width = scn.nextInt();
    
  System.out.println("Here is your staircase:");  
  draw( num, width);

}
     public static void draw(int number, int wide) {
       
     int space=0;
     for( int n = 0; n < number; n++ ) {
     
     
     for( int height = 0; height < 2; height++ ){
       for( int k = 0; k < 2; k++ )
        System.out.print( "*" );
       for( int i = 0; i < space; i++ )
        System.out.print( " " );
       for( int width = 0; width < wide; width++ )
        System.out.print( "*" );
     System.out.println();

     }
     space = space + 6;
     }

     return;
}
}