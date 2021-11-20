import by.gsu.epamlab.BusinessTrip;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] businessTrips = {new BusinessTrip("Anton", 162, 5),
                new BusinessTrip("Katya", 2005, 11),
                null,
                new BusinessTrip("Sasha", 1020, 5),
                new BusinessTrip("Dima", 1000, 2),
                new BusinessTrip()};
        System.out.println("Trips:");
        double maxCost = 0;
        BusinessTrip maxCostTrip = new BusinessTrip();
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                businessTrip.show();
                if (maxCost < businessTrip.getTotal()) {
                    maxCost = businessTrip.getTotal();
                    maxCostTrip = businessTrip;
                }
            }
        }
        System.out.println("The business trip with maximum cost");
        maxCostTrip.show();
        businessTrips[businessTrips.length - 1].setTransportationExpenses(1207);
        System.out.printf("Duration = %d \n", (businessTrips[0].getNumberOfDays() + businessTrips[1].getNumberOfDays()));
        System.out.println("Array content: ");
        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }


    }
}
