public class SmartTransportationSystem {

    public void MakeBooking(String name, String type, int distance, String payment) {

        System.out.println("================================");
        System.out.println("Passenger Name: " + name);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Distance: " + distance);

        double fare = calculateFare(type, distance);
        double finalFare = calculateTax(name, distance, fare);

        CheckMethod(payment);

        confirmBooking(name, type, distance, finalFare);
    }

    public double calculateFare(String type, int distance) {

        double fare = 0;

        if (type.equalsIgnoreCase("BUS")) {
            fare = distance * 2;
        }
        else if (type.equalsIgnoreCase("TAXI")) {
            fare = distance * 8;
        }
        else if (type.equalsIgnoreCase("TRAIN")) {
            fare = distance * 4;
        }
        else {
            System.out.println("Invalid Vehicle");
        }

        System.out.println("Base Fare: " + fare);
        return fare;
    }

    public double calculateTax(String name, int distance, double fare) {

        double tax;

        if (distance > 100) {
            tax = fare * 0.10;
        }
        else {
            tax = fare * 0.05;
        }

        System.out.println("Tax: " + tax);

        double finalFare = fare + tax;

        if (name.equalsIgnoreCase("Ali")) {
            finalFare = finalFare - (finalFare * 0.15);
            System.out.println("Special Discount Applied");
        }

        System.out.println("Final Fare: " + finalFare);

        return finalFare;
    }

    public void CheckMethod(String payment) {

        if (payment.equalsIgnoreCase("CARD")) {

            System.out.println("Processing Card Payment...");
            System.out.println("Verifying Card...");
            System.out.println("Deducting Amount...");
            System.out.println("Payment Successful");
        }
        else if (payment.equalsIgnoreCase("CASH")) {

            System.out.println("Receiving Cash...");
            System.out.println("Generating Receipt...");
            System.out.println("Payment Successful");
        }
        else if (payment.equalsIgnoreCase("ONLINE")) {

            System.out.println("Connecting Gateway...");
            System.out.println("Verifying Transaction...");
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Invalid Payment Method");
        }
    }

    public void confirmBooking(String name, String type, int distance, double finalFare) {

        System.out.println("Sending SMS Notification...");
        System.out.println("Passenger " + name + ", your booking has been confirmed.");

        System.out.println("Saving Booking Record...");
        System.out.println("Passenger: " + name);
        System.out.println("Vehicle: " + type);
        System.out.println("Distance: " + distance);
        System.out.println("Amount Paid: " + finalFare);

        System.out.println("================================");
    }
}