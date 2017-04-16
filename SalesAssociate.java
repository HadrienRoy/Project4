public class SalesAssociate extends Employee{
	
	//minimum task level = 1
	
	private int numClients;
	private String[] products;
	private RegionalManager supervisor;
	
	//constructor
	SalesAssociate(int IDNumber, String name, Task[] taskList, int numClient, String[] products, RegionalManager supervisor){
		this.numClients = numClients;
		this.products = products;
		this.supervisor = supervisor;
	}
	
	//getters and setters
	public int getNumClients(){
		return numClients;
	}
	public void setNumClients(int newNumClients){
		numClients = newNumClients;
	}
	public String[] getProducts(){
		return products;
	}
	public void setProducts(String[] newProducts){
		products = newProducts;
	}
	public RegionalManager getSupervisor(){
		return supervisor;
	}
	public void setSupervisor(RegionalManager newSupervisor){
		supervisor = newSupervisor;
	}
	// toString method
	public String toString(){
		String salesAssociateInfo = "Sales Associate\n" + super.toString() + "\n" + "Regional Manager: " + supervisor + 
				"\n" + "Number of clients: " + numClients + "\n" + "Products to sell:\n" + products;
		return salesAssociateInfo;
	}
	
	//equals method. Do not edit!
	public boolean equals(SalesAssociate s){
		boolean equal = super.equals(s);
		equal = equal && (s.getNumClients() == numClients);
		equal = equal && (s.getSupervisor().equals(supervisor));
		
		for(int i = 0; i < products.length; i++){
			equal = equal && (products[i].equals(s.getProducts()[i]));
		}
		return equal;
	}
	
}