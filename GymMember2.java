public class GymMember2{
	private String name;
	private String membershipType;
	private int  months;
	
	public GymMember(String name, String membershipType, int months){
		this.name = name;
		this.membershipType = membershipType;
		this.months = months;
	}
	
	public String getName(){
		return name;
	}
	public String getMembershipType(){
		return membershipType;
	}
	public int getMonths(){
		return months;
	}
	public void setMembershipType(String membershipType){
		this.membershipType = membershipType;
	}
	public void setMonths(int months){
		this.months = months;
	}
	
	public double calculateTotalFee(){
		double monthlyRate = 0;
		switch(membershipType){
			case "Basic": 
				monthlyRate = 500;
				break;
			case "Standard":
				monthlyRate = 850;
				break;
			case "Premium":
				monthlyRate = 1700;
				break;
			default:
				monthlyRate = 0.0;
				break;
		}
		double totalPay = monthlyRate * months;
		if(months >= 6){
			totalPay = totalPay * 0.90;
		}
		return totalPay;
	}
}
