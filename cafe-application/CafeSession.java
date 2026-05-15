public class CafeSession{
	private String customerName;
	private char planCode;
	private double hoursUsed;
	private double hourlyRate;
	
	public CafeSession(String customerName, char planCode, double hoursUsed, double hourlyRate){
		customerName = customerName;
		planCode = planCode;
		hoursUsed = hoursUsed;
		hourlyRate = hourlyRate;
	}
	
	public String getCustomerName(){
		return customerName;
	}
	public char getPlanCode(){
		return planCode;
	}
	public double getHoursUsed(){
		return hoursUsed;
	}
	public double getHourlyRate(){
		return hourlyRate;
	}
	
	public void setCustomerName(String customerName){
		customerName = customerName;
	}
	public void setPlanCode(char planCode){
		planCode = planCode;
	}
	public void setHoursUsed(double hoursUsed){
		hoursUsed = hoursUsed;
	}
	public void determinePlanRate(double hourlyRate){
		hourlyRate = hourlyRate;
	}
	
	public double calculateBill(){
		double totalbill = hoursUsed * hourlyRate;
		return totalbill;
	}
}
