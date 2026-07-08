public class Main {

    public static void main(String[] args) {

        SmartTransportationSystem system = new SmartTransportationSystem();

        system.MakeBooking("Ali", "BUS", 120, "CARD");

        system.MakeBooking("Ahmed", "TAXI", 30, "CASH");

        system.MakeBooking("Sara", "TRAIN", 250, "ONLINE");
    }
}