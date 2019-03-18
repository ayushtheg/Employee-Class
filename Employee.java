class Employee{
	private String name;
	private int number;
	private String hireDate;
	public Employee(String name, int number, String hireDate){
		this.name = name;
		this.number = number;
		this.hireDate = hireDate;
	}
	protected String getName(){
		return this.name;
	}
	protected int getNumber(){
		return this.number;
	}
	protected String toooooooString(){
		return ("name: " + this.name + " number: " + this.number + " hire date: " + this.hireDate + ".");
	}
}
class ProductionWorker extends Employee{
	private int shift;
	private double pay;
	public ProductionWorker(String name, int number, String hireDate, int shift, double pay){
		super(name, number, hireDate);
		this.shift = shift;
		this.pay = pay;
	}
	protected String tooString(){
		if (this.shift == 0){
			return("No shift assigned");
		}
		else if (this.shift == 1){
			return (super.toString () + "Day shift pay: " + this.pay);
		}
		else{
			return (super.toString () + "Night shift pay: " + this.pay);
		}
		
	}
	protected double getPay(){
		return this.pay;
	}
	protected void setShift(int shift){
		this.shift = shift;
	}
	protected void setPay(int pay){
		this.pay = pay;
	}
	
}
class ShiftSupervisor extends Employee{
	protected double pay;
	protected double annualBonus;
	public ShiftSupervisor(String name, int number, String hireDate, double pay, double annualBonus){
		super(name, number, hireDate);
		this.pay = pay;
		this.annualBonus = annualBonus;
	}
	protected double getPay(){
		return this.pay;
	}
	protected double getAnnualBonus(){
		return this.annualBonus;
	}
	protected void setPay(int pay){
		this.pay = pay;
	}
	protected void setAnnualBonus(int annualBonus){
		this.annualBonus = annualBonus;
	}
}
class TeamLeader extends ProductionWorker{
	protected double monthlyBonus;
	protected int requiredHours;
	protected int attendedHours;
	public TeamLeader(String name, int number, String hireDate, int shift, double pay, double monthlyBonus, int requiredHours, int attendedHours){
		super(name, number, hireDate, shift,pay);
		this.monthlyBonus = monthlyBonus;
		this.requiredHours = requiredHours;
		this.attendedHours = attendedHours;
	}
	protected double getMonthlyBonus(){
		return this.monthlyBonus;
	}
	protected int getRequiredHours(){
		return this.requiredHours;
	}
	protected int getAttendedHours(){
		return this.attendedHours;
	}
	protected void setMonthlyBonus(int monthlyBonus){
		this.monthlyBonus = monthlyBonus;
	}
	protected void setRequiredHours(int requiredHours){
		this.requiredHours = requiredHours;
	}	
	protected void setAttendedHours(int attendedHours){
		this.attendedHours = attendedHours;
	}	
	protected String toooString(){
		return ("Name:");
	}
}
		
