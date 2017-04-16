public class Receptionist extends Employee{
	
	//minimum task level = 1
	
	private AssistantRegionalManager supervisor;
	private int maxTaskComplexityLevel;
	
	//constructor
	Receptionist(int IDNumber, String name, Task[] taskList, AssistantRegionalManager supervisor, int maxTaskComplexityLevel){
		this.supervisor = supervisor;
		this.maxTaskComplexityLevel = maxTaskComplexityLevel;
	}
	
	//getters and setters
	public int getSupervisor(){
		return supervisor;
	}
	public void setSupervisor(AssistantRegionalManager newSupervisor){
		supervisor = newSupervisor;
	}
	public int getMaxTaskComplexityLevel(){
		return maxTaskComplexityLevel;
	}
	public void setMaxTaskComplexityLevel(int newMaxTaskComplexityLevel){
		maxTaskComplexityLevel = newMaxTaskComplexityLevel;
	}
	// toString method
	public String toString(){
		String receptionistInfo = "Receptionist\n" + super.toString() + "\n" + "Assistant Regional Manager: " + supervisor + 
				"\n" + "Max Task Level: " + maxTaskComplexityLevel;
		return receptionistInfo;
	}
	
	
	//equals method. Do not edit!
	public boolean equals(Receptionist r){
		boolean equal = super.equals(r);
		equal = equal && (r.getSupervisor().equals(supervisor));
		equal = equal && (r.getMaxTaskComplexityLevel() == maxTaskComplexityLevel);
		return equal;
	}
}