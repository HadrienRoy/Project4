public abstract class Employee {	
	
	private int IDNumber;
	private String name;
	private Task[] taskList;
	
	
	// making an empty object 
	Employee(){}
	//constructor
	Employee(int IDNumber, String name, Task[] taskList){
		this.IDNumber = IDNumber;
		this.name = name;
		this.taskList = taskList;
	}
	
	//getters and setters
	public int getIDNumber(){
		return IDNumber;
	}
	public void setIDNumber(int newIDNumber){
		IDNumber = newIDNumber;
	}
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name = newName;
	}
	public Task[] getTaskList(){
		return taskList;
	}
	public void setTaskList(Task[] newTaskList){
		tasklist = newTaskList;
	}
	
	//TO DO
	public String toString(){
		String employeeInfo = "Name: " + name + "\n" + "ID: " + IDNumer + "\n" + "Tasklist: " + "\n" + taskList;
	}
	
	//equals method. Do not edit!
	public boolean equals(Employee e){
		boolean equal = true;
		equal = equal && (e.getIDNumber() == IDNumber);
		equal = equal && (e.getName().equals(name));
		for(int i = 0; i < taskList.length; i++){
			equal = equal && (taskList[i].equals(e.getTaskList()[i]));
		}
		return equal;
	}
}