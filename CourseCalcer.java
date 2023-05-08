
import java.util.Scanner;

public class CourseCalcer {
	 
	
	public static void main(String[] args){
		
		String[] inputData = collector();
		CourseList taken = new CourseList(inputData);
		
	}


	public static String[] collector(){
			
			
		String[] result = new String[3];
		
		Scanner input = new Scanner(System.in);
		
		//add a delete from whole option
		//add an add from nothing option
		
		//collecting program
		System.out.println("Please Enter your program: ");
		String program = input.nextLine();
		result[0] = program;
		
		//collecting year of study
		System.out.println("Please enter the year of study you are currently completing");
		String year = input.nextLine();
		result[1] = year;
		
		System.out.println("Please enter the term you are completing: F(fall) ,W(winter) or S(summer)");
		String term = input.nextLine();
		result[2] = term;
		
		return result;
		
	}
}

		
	