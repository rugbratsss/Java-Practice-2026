public class EnhancedCarRental{
	//instance field
	private String customerName;
	private String carGroup;
	private double ratePerDay;
	private int rentalDays;
	
	//constructors
	public EnhancedCarRental(String customerName, String carGroup, double ratePerDay, int rentalDays){
		this.customerName = customerName;
		this.carGroup = carGroup;
		this.ratePerDay = ratePerDay;
		this.rentalDays = rentalDays;
	}
	//accesssors
	public String getCustomerName(){
		return customerName;
	}
	public String getCarGroup(){
		return carGroup;
	}
	public double getRatePerDay(){
		return ratePerDay;
	}
	public int getRentalDays(){
		return rentalDays;
	}
	
	public double calculateDiscount(){
		double discount = 0;
		switch(carGroup){
			case "Hatch":
				discount = 0.05;
				break;
			case "Sedan":
				discount = 0.10;
				break;
			case "SUV":
				discount = 0.12;
				break;
			case "Van":
				discount = 0.08;
				break;
			default:
				discount = 0.00;
				break;
		}
		return (ratePerDay * rentalDays) * discount;
	}
	public double calculateTotalCost(){
		double totalCost = (ratePerDay*rentalDays) - calculateDiscount();
		return totalCost * 1.15;
	}
	


}
