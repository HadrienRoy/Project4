public class Task {
	private String name;
	private int level;
	
	//constructor
	Task(String name, int level){
		this.level = level;
	}
	//getters and setters
	public String getName(){
		return name;
	}
	public int getLevel(){
		return level;
	}
	// toString method
	public String toString(){
		String taskInfo = "Task: " + name + "\tLevel: " + level;
	}
	
	//equals method. Do not edit!
	public boolean equals(Task t){
		return ((t.getLevel() == level) && (t.getName().equals(name)));
	}
}