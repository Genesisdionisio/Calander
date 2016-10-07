/*Genesis Dionisio
*lab 2
*Section 4
*/
import java.util.*; 

public class Calander {



   public static void main(String[] args) {
   
      Scanner kb = new Scanner(System.in);
      System.out.println("What year is it?");
      int yr = kb.nextInt();
      JulianDate JD = new JulianDate();
      int date = JD.toJulian(yr,1,1);
      int DayofWeek = (date+1)%7;
      int Days =0;
      int Daynumber =0;
      boolean leapyear = (yr%4==0) &&(yr%100!=0)||(yr%400==0);
   
   
   
   
      for(int month =1;month<=12; month++) 
      {
      System.out.println(" ");
      Daynumber =0;
         switch(month) 
         {
            case 1: System.out.printf("%14s\n", "january");
               Days = 31;
               break;
            case 2: System.out.printf("%14s\n", "February");
               if(leapyear)
                     Days = 29;
                  else
                     Days =28;
               
               break;
            case 3: System.out.printf("%14s\n", "March");;
               Days = 31;
               break;
            case 4: System.out.printf("%14s\n", "April");  
               Days = 30;          
               break;
            case 5: System.out.printf("%14s\n", "May");
               Days = 31;
               break;
            case 6: System.out.printf("%14s\n", "June");
               Days = 30;
               break;
            case 7: System.out.printf("%14s\n", "July");
               Days = 31;
               break;
            case 8: System.out.printf("%14s\n", "August");
               Days = 31;
               break;
            case 9: System.out.printf("%14s\n", "September");
               Days = 30;
               break;
            case 10: System.out.printf("%14s\n", "October");
               Days = 31;
               break;
            case 11: System.out.printf("%14s\n", "November");
               Days = 30;
               break;
            case 12: System.out.printf("%14s\n", "Decenber");
               Days = 31;
               break;                  
         
         }
         System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","S","M","Tu","W","Th","F","Su"); 
         if (DayofWeek >0){
         System.out.printf("%" + (DayofWeek * 3) + "c", ' ');
         }
         int DaysinMonth = 1;
         while ( DaysinMonth <= Days)
         { 
         System.out.printf("%3d", (Daynumber + 1));
            Daynumber++;
            DayofWeek++;
            if (DayofWeek == 7)
            {
               System.out.println(" ");
               DayofWeek = 0;
            }
            
            DaysinMonth++;

         }
                
      }
   }
}

