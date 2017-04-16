public class RegionalManager extends Employee {
	
	private int RegionNum;
	private Employee[] subordinates;
	private int minimumTask;
	
	RegionalManager(int IDNumber, String name, Task[]taskList, int RegionNum, Employee[] subordinates, int minimumTask){
		super.setIDNumber(IDNumber);
		super.setName(name);
		super.setTaskList(taskList);
		this.RegionNum = RegionNum;
		this.subordinates = subordinates; 
		this.minimumTask = minimumTask;
	}
	
	RegionalManager(int IDNumber,String name, Task[]taskList, int RegionNum, int minimumTask){
		super.setIDNumber(IDNumber);
		super.setName(name);
		super.setTaskList(taskList);
		this.RegionNum = RegionNum;
		this.minimumTask = minimumTask;
		
	}
	
	//getters and setters
	public int getRegionNum(){
		return RegionNum;
	}
	public void setRegionNum(int newRegionNum){
		RegionNum = newRegionNum;
	}
	public Employee[] getSubordinates(){
		return subordinates;
	}
	public void setSubordinates (Employee [] newSubordinates){
		subordinates = newSubordinates;
	}
	public int getMinimumTask(){
		return minimumTask;
	}
	public void setMinimumTask(int newMinimumTask){
		minimumTask = newMinimumtask;
	}
	// toString method
	public String toString(){
		String regionalManagerInfo = "Regional Manager\n" + super.toString() + "\n" + "Region Number: " + RegionNum + 
				"\n" + "Minimum Task Level: " + minimumTask + "\n" + "Employees: " + "\n" + subordinates;
	   return regionalManagerInfo;
	}

	
	
	//equals method. Do not edit!
	public boolean equals(RegionalManager r){
		boolean equal = super.equals(r);
		equal = equal && (r.getRegionNum() == RegionNum);
		equal = equal && (r.getMinimumTask() == minimumTask);
		for(int i = 0; i < subordinates.length; i++){
			equal = equal && (subordinates[i].equals(r.getSubordinates()[i]));
		}
		return equal;
	}
}