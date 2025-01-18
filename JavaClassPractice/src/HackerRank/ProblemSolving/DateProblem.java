package HackerRank.ProblemSolving;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateProblem {
	
	
	
	public static String CurrentDayOftheweek(int year,int month,int day){
//		 int year=2024;
//	        int month=12;
//	        int day=11;
	        LocalDate ldd=LocalDate.of(year,month,day);
//	        LocalDate ldd=LocalDate.of(2024,12,11);
	        DayOfWeek ldddow=ldd.getDayOfWeek();
//	        System.out.println("today :"+ldddow);
	        String tday=ldddow.toString();
//	        System.out.println(today);
	    return tday;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		 String inputDate = "12/11/24"; // Example date: December 11, 2024
//
//	        // Define the formatter for mm/dd/yy
//	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
//
//	        // Parse the date
//	        LocalDate date = LocalDate.parse(inputDate, formatter);
//	        
//	        
//	  
//	        // Get the day of the week
//	        DayOfWeek dayOfWeek = date.getDayOfWeek();
//	        
//	        LocalDate ld=LocalDate.now();
//	        System.out.println(ld);
//	        System.out.println(ld.getDayOfWeek());
//
//	        // Print the day of the week
//	        System.out.println("The day of the week is: " + dayOfWeek);
		
	        String youGot=CurrentDayOftheweek(2001,7,1);
	        System.out.println(youGot);
	        
//	        System.out.println("Calender start Here....");
//	        
	        Calendar cl=Calendar.getInstance();
//	        System.out.println(cl);
	        
	        cl.set(2024,12-1,12);
	        
	        int rr=cl.get(cl.DAY_OF_WEEK);
	        System.out.println(rr);
	      
	        System.out.println(Calendar.SUNDAY);
	
	}

}
