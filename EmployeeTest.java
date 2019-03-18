import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class EmployeeTest{
	public static void main(String[] args){
		Date d1 = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyy-mm-dd hh:mm:ss");
		String strDate = dateFormat.format(d1);
		Employee employee[] = new Employee[3];
		employee [0] = new ShiftSupervisor ("Harry", 1, strDate, 1000, 100);
		employee[1] = new TeamLeader ("George", 2, strDate, 2000, 200, 10000, 14, 52);
		for(Employee x:employee){
			System.out.println(x);
		}
	}		
}	
