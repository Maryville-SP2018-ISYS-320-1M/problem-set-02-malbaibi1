/*
 ISYS 320
 Name: Mansour Albaibi
 Date: 15-4-2018 
*/

public class P1_NumbersRightMethod {

 public static void main(String[] args) {
   
   drawNumbersRight(7);                              //calling methods

 }
     public static void drawNumbersRight(int height) {
      int num=6;
      for( int line = 0; line < height; line++ ) {                                                        //loop to control number of lines
      int numberToWrite = line + 1 ;
      for( int space = 0; space < num; space++ )                                                    //loop to control spaces in each line 
      System.out.print( " " );
      for( int numOfTimesPrinted = 1; numOfTimesPrinted <= numberToWrite; numOfTimesPrinted++ )   //looop to print same number multiple times
      System.out.print( numberToWrite );
      System.out.println();
      num=num-1;
   
  }
   return;

}

}