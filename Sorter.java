import java.util.Collections;

public class Sorter{
	//constructor
	Sorter(){}
	
	//call level display
	public static sort(Employee[] Employee){
		boolean swapped = false;
		String temp;
		while (swapped){
			for (int i=0; Employee.length){
				swapped = false;
				for (int j = 0; Employee.length - 1){
					if((Employee[j].getName).compareToIgnoreCase((Employee[j+1].getName()) > 0)){
						temp = Employee[j].getName();
						Employee[j].getName() = Employee[j+1].getName();
						Employee[j+1].getName() = temp;
						swapped = true;
					}
					if (!swapped){
						break;
					}
				}
			}
		}
		
		return Employee;
	}
}