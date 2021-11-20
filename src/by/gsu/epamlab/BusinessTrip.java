package by.gsu.epamlab;

public class BusinessTrip {
    private final static int DAILY_RATE = 100;
    private String emploeeAccount;
    private int transportationExpenses;
    private int numberOfDays;

    public BusinessTrip() {
    }

    public BusinessTrip(String emploeeAccount, int transportationExpensec, int numberOfDays) {
        this.emploeeAccount = emploeeAccount;
        this.transportationExpenses = transportationExpensec;
        this.numberOfDays = numberOfDays;
    }


    public String getEmploeeAccount() {
        return emploeeAccount;
    }

    public void setEmploeeAccount(String emploeeAccount) {
        this.emploeeAccount = emploeeAccount;
    }

    public int getTransportationExpenses() {
        return transportationExpenses /100;
    }

    public void setTransportationExpenses(int transportationExpenses) {
        this.transportationExpenses = transportationExpenses;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getTotal(){
        return transportationExpenses + DAILY_RATE * numberOfDays;
    }

    public void show(){
        System.out.println("rate = " + convertMoney(DAILY_RATE) + "\naccount = "+ emploeeAccount +
                "\ntransport = " + convertMoney(transportationExpenses) + "\ndays = " + numberOfDays +
                "\ntotal = " + convertMoney(getTotal()) + "\n");
    }

    @Override
    public String toString() {
        return this.emploeeAccount+";" + convertMoney(transportationExpenses) + ";" + numberOfDays + ";" + convertMoney(getTotal());
    }

    private String convertMoney(int cost){
        return  (String.format("%.2f", (double)cost/100));
    }
}
