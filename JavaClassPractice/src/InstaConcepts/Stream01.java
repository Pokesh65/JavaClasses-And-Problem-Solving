package InstaConcepts;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class Stream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a=new ArrayList<>();
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(15);
		a.add(26);
		System.out.println(a);
		
		//Stream "a" va process pana poren adhuku ready pana stream nu use pandren
		//map la each value oda "5" plus pandren 
		//then plus pana values ah list format la venumndrathala collect . tolist using 
		
		System.out.println("\n...MAP...");
		List<Integer> res=a.stream().map(e->e+5).collect(Collectors.toList());
		System.out.println(res);
	
		System.out.println("\n...FILTER...");
		List<Integer> res1=a.stream().filter(e->e>15).collect(Collectors.toList());
		System.out.println(res1);

		System.out.println("\n...MAP & FILTER...");
		List<Integer> res2=a.stream().map(e->e*5).filter(e->e>17).collect(Collectors.toList());
		System.out.println(res2);
		
		//any one value need to match 
		//value are in true or false so dont need to collect
		System.out.println("\n...AnyMatch");
		boolean res3=a.stream().anyMatch(e->e>15);
		System.out.println(res3);
		
		//all values need to match
		//value are in true or false so dont need to collect
		System.out.println("\n...AllMatch...");
		boolean res4=a.stream().allMatch(e->e>15);
		System.out.println(res4);
		
		//it used to count the values e>14
		System.out.println("\n...Filter & Count...");
		long count=a.stream().filter(e->e>14).count();
		System.out.println(count);
		
		//distinct it doesn't count duplicate values 
		System.out.println("\n...Filter & Distinct & Count...");
		long count1=a.stream().filter(e->e>14).distinct().count();
		System.out.println(count1);
		
		//adding array values
		System.out.println("\n...Reduce...");
		Integer add1=a.stream().reduce(0,(e,i)->e+i);
		System.out.println(add1);
		
		System.out.println("-------------------");
		LocalDateTime ld= LocalDateTime.now();
		LocalDateTime ldns= LocalDateTime.now().withNano(0);
		System.out.println(ld);
		System.out.println(ldns);
		
		System.out.println("-------------------");
		LocalDateTime ld1= LocalDateTime.of(2024,4,10,12,12);
		System.out.println(ld.getDayOfWeek());
		
		
		System.out.println("-------------------");
		System.out.println(ld.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		System.out.println(ld.isAfter(ld1));
		System.out.println(ld.isBefore(ld1));
		
		System.out.println(ld.plusDays(20));
		System.out.println(ld.minusDays(20));
		System.out.println("----------------");
		
		
		LocalTime lt=LocalTime.now();
		lt=lt.plusSeconds(300);
		System.out.println(lt);
		
		LocalTime lt1=LocalTime.now();
		System.out.println(lt1.isAfter(lt));
		System.out.println(lt1);
		
		LocalDate lll=LocalDate.of(2015,5-1,8);
		System.out.println(lll.getDayOfWeek());
		
		 LocalDateTime ld12 = LocalDateTime.now();
	        
	        // Define a formatter to exclude milliseconds
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
	        
	        // Format the LocalDateTime
	        String formattedDateTime = ld12.format(formatter);
	        
	        // Print the formatted date-time
	        System.out.println(formattedDateTime);
		
		
	}

}
