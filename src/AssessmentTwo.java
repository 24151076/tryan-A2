public class AssessmentTwo {
    public static void main(String[] args) {
        AssessmentTwo assessment = new AssessmentTwo();
        //assessment.partThree();
        //assessment.partFourA();
        assessment.partFourB();
    }

    public void partThree(){
        System.out.println("hello");
        // Create a new Ride object
        Ride ride = new Ride("HyperCoaster", "rollerCoaster", "Max", null, false);

        // Create Visitor objects
        Visitor visitor1 = new Visitor("Nehemia", 20, "Female", true, false);
        Visitor visitor2 = new Visitor("Jason", 21, "Male", true, true);
        Visitor visitor3 = new Visitor("Jack", 22, "Male", true, false);
        Visitor visitor4 = new Visitor("Sharon", 23, "Female", true, true);
        Visitor visitor5 = new Visitor("Benny", 24, "Female", true, false);

        // Add a minimum of 5 Visitors to the Queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // Print all Visitors in the Queue
        ride.printQueue();

        // Remove a Visitor from the Queue
        ride.removeVisitorFromQueue(visitor3);

        // Print all Visitors in the Queue after removal
        ride.printQueue();
    }

    public void partFourA(){
        System.out.println("hello");
        // Create a new Ride object
        Ride ride = new Ride("HyperCoaster", "rollerCoaster", "Max", null, true);
        //Creating an operator and assigning to the ride so it can open
        Employee employee1 = new Employee("James", 40, "Male", "Ride Operator", 40000);
        ride.assignOperator(employee1);
        // Create Visitor objects
        Visitor visitor1 = new Visitor("Nehemia", 20, "Female", true, false);
        Visitor visitor2 = new Visitor("Jason", 21, "Male", true, true);
        Visitor visitor3 = new Visitor("Jack", 22, "Male", true, false);
        Visitor visitor4 = new Visitor("Sharon", 23, "Female", true, true);
        Visitor visitor5 = new Visitor("Benny", 24, "Female", true, false);

        // Add a minimum of 5 Visitors to the Queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.visitorTakesTheRide();
        ride.visitorTakesTheRide();
        ride.visitorTakesTheRide();
        ride.visitorTakesTheRide();
        ride.visitorTakesTheRide();

        ride.checkingIfVisitorIsInCollection(visitor3);

        ride.checkingCollectionAmount();

        ride.printRideHistory();
    }
    public void partFourB(){
        System.out.println("hello");
        // Create a new Ride object
        Ride ride = new Ride("HyperCoaster", "rollerCoaster", "Max", null, true);
        //Creating an operator and assigning to the ride so it can open
        Employee employee1 = new Employee("James", 40, "Male", "Ride Operator", 40000);
        ride.assignOperator(employee1);
        // Create Visitor objects
        Visitor visitor1 = new Visitor("Nehemia", 20, "Female", true, false);
        Visitor visitor2 = new Visitor("Jason", 21, "Male", true, true);
        Visitor visitor3 = new Visitor("Jack", 22, "Male", true, false);
        Visitor visitor4 = new Visitor("Sharon", 23, "Female", true, true);
        Visitor visitor5 = new Visitor("Benny", 24, "Female", true, false);

        // Add a minimum of 5 Visitors to the Queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        ride.visitorTakesTheRide();
        ride.visitorTakesTheRide();
        ride.visitorTakesTheRide();
        ride.visitorTakesTheRide();
        ride.visitorTakesTheRide();

        ride.printRideHistory();

        ride.sortVisitors();

        ride.printRideHistory();
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}