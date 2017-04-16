public class AssistantRegionalManager extends Employee{
	
	private RegionalManager manager;
	//private int minimum task cannot be higher than its regional manager
	private int minimum Task;
	//constructor
	AssistantRegionalManager(int IDNumber, String name, Task[] tasklist, RegionalManager manager, int minimumTask){
		this.manager = manager;
		
	}
	//getters and setters
	public RegionalManager getManager(){
		return manager;
	}
	public void setManager(RegionalManager newManager){
		manager = newManager;
	}
	public int getMinimumTask(){
		return minimumTask;
	}
	public void setMinimumTask(int newMinimumTask){
		minimumTask = newMinimumTask;
	}
	// toString method
	public String toString(){
		String assistantRegionalManagerInfo = "Assistant Regional Manager\n" + super.toString() + "\n" + "Regional Manager: " + manager + "\n" + "Minimum Task Level: " + minimumTask;
	    return assistantRegionalManagerInfo;
	}
	
	
	
	//equals method. Do not edit!
	public boolean equals(AssistantRegionalManager r){
		boolean equal = super.equals(r);
		equal = equal && (r.getMinimumTask() == minimumTask);
		equal = equal && (r.getManager().equals(manager));
		return equal;
	}
}