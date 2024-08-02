public class AssessmentTwo {
    public static void main(String[] args) {
        AssessmentTwo assessment = new AssessmentTwo();
        //assessment.partThree();
        //assessment.partFourA();
        //assessment.partFourB();
        //assessment.partFive();
        //assessment.partSix();
        assessment.partSeven();
    }

    public void partThree(){
        System.out.println("hello");
        // Create a new Ride object
        Ride ride = new Ride("HyperCoaster", "rollerCoaster", "Max", null, false, 1, 0);

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
        Ride ride = new Ride("HyperCoaster", "rollerCoaster", "Max", null, true, 1, 0);
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

        ride.runOneCycle();
        ride.runOneCycle();
        ride.runOneCycle();
        ride.runOneCycle();
        ride.runOneCycle();

        ride.checkingIfVisitorIsInCollection(visitor3);

        ride.checkingCollectionAmount();

        ride.printRideHistory();
    }
    public void partFourB(){
        System.out.println("hello");
        // Create a new Ride object
        Ride ride = new Ride("HyperCoaster", "rollerCoaster", "Max", null, true, 1, 0);
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

        ride.runOneCycle();
        ride.runOneCycle();
        ride.runOneCycle();
        ride.runOneCycle();
        ride.runOneCycle();

        ride.printRideHistory();

        ride.sortVisitors();

        ride.printRideHistory();
    }
    public void partFive(){
        System.out.println("hello");
        // Create a new Ride object
        Ride ride1 = new Ride("HyperCoaster", "rollerCoaster", "Max", null, true, 2, 0);
        //Creating an operator and assigning to the ride so it can open
        Employee employee1 = new Employee("James", 40, "Male", "Ride Operator", 40000);
        ride1.assignOperator(employee1);
        // Create Visitor objects
        Visitor visitor1 = new Visitor("Nehemia", 20, "Female", true, false);
        Visitor visitor2 = new Visitor("Jason", 21, "Male", true, true);
        Visitor visitor3 = new Visitor("Jack", 22, "Male", true, false);
        Visitor visitor4 = new Visitor("Sharon", 23, "Female", true, true);
        Visitor visitor5 = new Visitor("Benny", 24, "Female", true, false);
        Visitor visitor6 = new Visitor("Leo", 25, "Male", true, false);
        Visitor visitor7 = new Visitor("Tom", 26, "Male", true, false);
        Visitor visitor8 = new Visitor("Sherly", 27, "Female", true, false);
        Visitor visitor9 = new Visitor("Ben", 28, "Male", true, false);
        Visitor visitor10 = new Visitor("David", 29, "Male", true, false);


        // Add 10 Visitors to the Queue
        ride1.addVisitorToQueue(visitor1);
        ride1.addVisitorToQueue(visitor2);
        ride1.addVisitorToQueue(visitor3);
        ride1.addVisitorToQueue(visitor4);
        ride1.addVisitorToQueue(visitor5);
        ride1.addVisitorToQueue(visitor6);
        ride1.addVisitorToQueue(visitor7);
        ride1.addVisitorToQueue(visitor8);
        ride1.addVisitorToQueue(visitor9);
        ride1.addVisitorToQueue(visitor10);

        ride1.printQueue();

        ride1.runOneCycle();

        ride1.printQueue();

        ride1.printRideHistory();
    }

    public void partSix(){
        System.out.println("hello");

        Ride ride1 = new Ride("HyperCoaster", "rollerCoaster", "Max", null, true, 5, 0); //made max riders 5 so only had to run it once

        Employee employee1 = new Employee("James", 40, "Male", "Ride Operator", 40000);

        ride1.assignOperator(employee1);

        Visitor visitor1 = new Visitor("Nehemia", 20, "Female", true, false);
        Visitor visitor2 = new Visitor("Jason", 21, "Male", true, true);
        Visitor visitor3 = new Visitor("Jack", 22, "Male", true, false);
        Visitor visitor4 = new Visitor("Sharon", 23, "Female", true, true);
        Visitor visitor5 = new Visitor("Benny", 24, "Female", true, false);

        // Add 5 Visitors to the Queue
        ride1.addVisitorToQueue(visitor1);
        ride1.addVisitorToQueue(visitor2);
        ride1.addVisitorToQueue(visitor3);
        ride1.addVisitorToQueue(visitor4);
        ride1.addVisitorToQueue(visitor5);

        ride1.runOneCycle();

        ride1.printRideHistory();

        ride1.exportVisitorsToFile("visitors.text");
    }

    public void partSeven(){
        Ride ride = new Ride();

        ride.importVisitorsFromFile("visitors.text");

        ride.printRideHistory();
    }
}