public class HolidayPackage {
    private boolean international;
    private String accommodationType;
    private int days;
    private double packagePrice;

    public HolidayPackage(boolean international, String accommodationType, int days, double packagePrice) {
        this.international = international;
        this.accommodationType = accommodationType;
        this.days = days;
        this.packagePrice = packagePrice;
    }

    public boolean getInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }

    public double calculateCost() {
        double cost = 0.0;
        char type = accommodationType.toUpperCase().charAt(0);

        if (type == 'H') {
            cost = packagePrice * 0.35;
        } else if (type == 'R') {
            cost = packagePrice * 0.25;
        } else {
            cost = packagePrice * 0.15;
        }

        double finalCost = 0.0;

        if (days <= 5) {
            finalCost += cost;
        } else if (days >= 6 && days <= 10) {
            finalCost += (cost * 0.90);
        } else {
            finalCost += (cost * 0.80);
        }

        if (international) {
            finalCost += (packagePrice * 0.30);
        }

        return finalCost;
    }
}
