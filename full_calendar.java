package demo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.util.Scanner;


public class full_calendar {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter the Year");
		int selectYear = sc.nextInt();
		 System.out.println("Enter the Month");
		int selectMonth = sc.nextInt() - 1;
		
		Calendar cal = new GregorianCalendar();
		int tday = cal.get(Calendar.DATE);
		int tmonth = cal.get(Calendar.MONTH);
		int tyear = cal.get(Calendar.YEAR);
		 //System.out.println(cyear);       //if you want current year.
		 
		
		 GregorianCalendar gcal = new GregorianCalendar(selectYear,selectMonth,1);
		 int day = gcal.getActualMaximum(Calendar.DATE);                     //maxiumum no of days in the month
		 int sWeek=gcal.get(Calendar.DAY_OF_WEEK);  
		 
		 
		 gcal= new GregorianCalendar(selectYear,selectMonth,day);
		 int totalweeks = gcal.getActualMaximum(Calendar.WEEK_OF_MONTH);       //total weeks in month
		// System.out.println(totalweeks);  //5

		 
		 System.out.println();            //extra spaces
		 System.out.println();           //extra spaces
		 String [] months= {"January" ,"February" , "March" , "April" , " May" , "June" , "July" , "August" , "September" , "October" ,
				 "November" , "December"};
		 
		 
		 System.out.println(" THE MONTH YOU SELECTED IS :-");
		 System.out.println(months[selectMonth]);
		 System.out.println(" THE YEAR YOU SELECTED IS :-");
		 System.out.println(selectYear);
		 
		 
		 System.out.println();            //extra spaces
		 System.out.println(); 
		 System.out.println("---------CALENDAR------" );
		 System.out.println();            //extra spaces
		
		 
		int count=1;                     //to count days 
			System.out.println(" SU MO TU WE TH FR SA");
			for(int i =1; i<=totalweeks; i++) 
			{
			System.out.println();        //to come in nxt line wehen work for 1 week 7 times.
		
			for(int j =1; j<=7; j++)
			{
				if(count < sWeek  || (count - sWeek + 1) > 31  )
				{  System.out.print("__");
					System.out.print(" ");
				}
				else
				{
					if(tday == (count - sWeek + 1) && tmonth == selectMonth
						&& tyear == selectYear)
					{
					System.out.print( " " + getDay((count-sWeek + 1)) + "");   // it will give the days.
					System.out.print(" ");
					}
					else
					{
						System.out.print(getDay((count - sWeek +1)));
						System.out.print(" ");
					}
				}
				count++;
				}
	
			}
		}

	private static String getDay(int i) {
		String dDate = Integer.toString(i);
		if(dDate.length() == 1) {
			dDate="0" + dDate;
			return dDate;
		}
		return dDate;
	}
}
	
	
 	

