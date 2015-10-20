import java.util.Scanner;

class HoursMinutesSeconds {
	public static void main(String args[]){
   Scanner input = new Scanner (System.in);
  
   int userInput = 0;
   int userHours = 0;
   int userMinutes = 0;
   int userSeconds = 0;
   int y = 0;
   int x = 0;
   
   userInput = input.nextInt();
   
   x = userInput / 3600;
   userHours = userInput % 3600;
   y = userHours / 60;
   userSeconds = userHours % 60;
   
   System.out.println(x + " hours");
   System.out.println(y + " minutes");
   System.out.println(userSeconds + " seconds");
   

   }
}
