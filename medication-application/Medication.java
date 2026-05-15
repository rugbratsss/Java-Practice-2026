public class Medication{
	private String medicationName;
	private double dosageMg;
	private int stockUnits;
	private double pricePerUnit ;
	final double LEVY = 0.05;
	
	public Medication(String medicationName, double dosageMg, int stockUnits, double pricePerUnit){
		this.medicationName = medicationName;
		this.dosageMg = dosageMg;
		this.stockUnits = stockUnits;
		this.pricePerUnit = pricePerUnit;
	}
	
	public String getMedicationName(){
		return medicationName;
	}
	public double getDosageMg(){
		return dosageMg;
	}
	public int getStockUnits(){
		return stockUnits;
	}
	public double getPricePerUnit(){
		return pricePerUnit;
	}
	
	public void setMedicationName(String medicationName){
		this.medicationName = medicationName;
	}
	public void setDosageMg(double dosageMg){
		this.dosageMg = dosageMg;
	}
	public void setStockUnits(int stockUnits){
		this.stockUnits = stockUnits;
	}
	public void setPricePerUnit(double pricePerUnit){
		this.pricePerUnit = pricePerUnit;
	}
	
	public double calculateStockValue(){
		double total1 = pricePerUnit * stockUnits;
		if(stockUnits > 100){
			total1 = total1 * ( 1 + LEVY);
		}
		return total1;
	}
}
