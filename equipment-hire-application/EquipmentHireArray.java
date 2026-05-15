public class EquipmentHireArray{
	private String customerName;
	private String equipmentType;
	private double dailyRate;
	private int rentalDays;
	
	public EquipmentHire(String customerName, String equipmentType, double dailyRate,int rentalDays){
		this.customerName = customerName;
		this.equipmentType = equipmentType;
		this.dailyRate = dailyRate;
		this.rentalDays = rentalDays;
	}
	public String getCustomerName(){
		return customerName;
	}
	public String getEquipmentType(){
		return equipmentType;
	}
	public double getDailyRate(){
		return dailyRate;
	}
	public int getRentalDays(){
		return rentalDays;
	}
	
	public double calculateSurcharge(){
		double sucharge;
		switch(equipmentType.toLowerCase()){
			case "submersible":
				sucharge = 0.15;
				break;
			case "sentrifugal":
				sucharge = 0.10;
				break;
			case "petrol":
				sucharge = 0.20;
				break;
			default:
				sucharge = 0.0;
				break;
		}
		return (dailyRate * rentalDays) * sucharge;
	}
	
	public double calculateTotalAmount(){
		double totalPay = (dailyRate * rentalDays) + calculateSurcharge();
		return totalPay * 1.15;
		
	}
}
