import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class Ride implements RideInterface {
    private String rideName;
    private String attractionType; // Movie world tries to specify whether the attraction is a coaster, tower, show, etc.
    private String thrillLevel; // Movie world's thrill rating system, values include: Max, Moderate, and Mild
    private boolean isOpen;
    private Employee operator;
    private Queue<Visitor> queue; //queue implements 'Queue' interface (so any of its child classes can then be used for flexibility), which stores visitor objects
    private LinkedList<Visitor> collectionOfVisitors; //LinkedList is specified because of task instructions

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.attractionType = "";
        this.thrillLevel = "";
        this.operator = null;
        this.isOpen = false;
        this.queue = new LinkedList<>(); //linkedList used for queue because it is the most commonly used class for Queue interface
        this.collectionOfVisitors = new LinkedList<>();
    }

    // Constructor with parameters
    public Ride(String rideName, String attractionType, String thrillLevel, Employee operator, boolean isOpen) {
        this.rideName = rideName;
        this.attractionType = attractionType;
        this.thrillLevel = thrillLevel;
        this.operator = operator;
        this.isOpen = isOpen;
        this.queue = new LinkedList<>();
        this.collectionOfVisitors = new LinkedList<>();
    }

    // Getters and Setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getAttractionType() {
        return attractionType;
    }

    public void setAttractionType(String attractionType) {
        this.attractionType = attractionType;
    }

    public String getThrillLevel() {
        return thrillLevel;
    }

    public void setThrillLevel(String thrillLevel) {
        this.thrillLevel = thrillLevel;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    // Method to assign an Employee to operate the ride
    public void assignOperator(Employee operator) {
        this.operator = operator;
        this.isOpen = (operator != null); //if operator is not null it evaluates to true, so when an operator is assigned the ride will open
    }

    // Interface method implementations
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        queue.offer(visitor);
        System.out.println(visitor.getName() + " was added to the queue."); //no failure message required because linkedlist is dynamic, it will always allow a new object to be inserted
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if(queue.remove(visitor)) {
            System.out.println(visitor.getName() + " was removed from the queue.");
        } else {
            System.out.println(visitor.getName() + " is not in the queue.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Queue:");
        for (Visitor visitor : queue) {
            System.out.println(visitor.getName());
        }
    }

    public void visitorTakesTheRide() { //method for adding a visitor
        if (isOpen && !queue.isEmpty()) { //provides some conditions for a visitor to take a ride (open and que not empty)
            Visitor visitor = queue.poll(); //first object is pulled from queue and assigned to 'visitor' variable
            collectionOfVisitors.add(visitor); //the visitor object is put into the collection
            System.out.println(visitor.getName() + " is taking a ride.");
        } else {
            System.out.println("The ride is either closed or there are no visitors in the queue.");
        }
    }

    public void checkingIfVisitorIsInCollection(Visitor visitor) {
        int x = 0;
        for (Visitor v : collectionOfVisitors) {
            if (v.equals(visitor)) {
                System.out.println(visitor.getName() + " was found");
                x = 1;
                break;
            }
        }
        if (x == 0) {
            System.out.println(visitor.getName() + " not found");
        }
    }

    public void checkingCollectionAmount() {
        int numberOfVisitors = collectionOfVisitors.size();
        System.out.println("Number of visitors in the collection: " + numberOfVisitors);
    }

    @Override
    public void printRideHistory() {
        Iterator<Visitor> iter = collectionOfVisitors.iterator();
        while (iter.hasNext()) {
            Visitor visitor = iter.next();
            System.out.println(visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {

    }
}
