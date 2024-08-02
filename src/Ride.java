import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
import java.io.*;
import java.nio.file.*;

public class Ride implements RideInterface {
    private String rideName;
    private String attractionType; // Movie world tries to specify whether the attraction is a coaster, tower, show, etc.
    private String thrillLevel; // Movie world's thrill rating system, values include: Max, Moderate, and Mild
    private boolean isOpen;
    private Employee operator;
    private Queue<Visitor> queue; //queue implements 'Queue' interface (so any of its child classes can then be used for flexibility), which stores visitor objects
    private LinkedList<Visitor> collectionOfVisitors; //LinkedList is specified because of task instructions
    private int maxRider;
    private int numOfCycles;

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.attractionType = "";
        this.thrillLevel = "";
        this.operator = null;
        this.isOpen = false;
        this.queue = new LinkedList<>(); //linkedList used for queue because it is the most commonly used class for Queue interface
        this.collectionOfVisitors = new LinkedList<>();
        this.maxRider = 1; //more reasonable default value than 0
        this.numOfCycles = 0; //default is 0
    }

    // Constructor with parameters
    public Ride(String rideName, String attractionType, String thrillLevel, Employee operator, boolean isOpen, int maxRider, int numOfCycles) {
        this.rideName = rideName;
        this.attractionType = attractionType;
        this.thrillLevel = thrillLevel;
        this.operator = operator;
        this.isOpen = isOpen;
        this.queue = new LinkedList<>();
        this.collectionOfVisitors = new LinkedList<>();
        this.maxRider = maxRider;
        this.numOfCycles = numOfCycles;
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

    public boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean open) {
        isOpen = open;
    }

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
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

    @Override
    public void runOneCycle() { //method for adding a visitor
        if (isOpen && !queue.isEmpty()) { //provides some conditions for a visitor to take a ride (open and que not empty)
            for (int i = 0; i < maxRider; i++) {
                Visitor visitor = queue.poll(); //first object is pulled from queue and assigned to 'visitor' variable
                collectionOfVisitors.add(visitor); //the visitor object is put into the collection
                System.out.println(visitor.getName() + " is taking a ride.");
            }
            numOfCycles += 1; //adds 1 to numOfCycles to track it
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
        System.out.println("Collection of visitors who have been on ride: ");
        Iterator<Visitor> iter = collectionOfVisitors.iterator();
        while (iter.hasNext()) {
            Visitor visitor = iter.next();
            System.out.println(visitor.getName());
        }
    }

    //method to sort visitors using Comparator
    public void sortVisitors() {
        Collections.sort(collectionOfVisitors, new ComparatorClass());
        System.out.println("Collection was sorted");
    }

    //method to write visitors details to a file
    public void exportVisitorsToFile(String filePath) {
        Path path = Paths.get(filePath); //by using path class, you can use useful methods e.g. can check if the file exists at that path
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Visitor visitor : collectionOfVisitors) {
                writer.write(visitor.toString()); //Visitor has an overridden toString() method
                writer.newLine();
            }
            System.out.println("Exported visitor data to file: " + path.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error exporting visitor data to file: " + e.getMessage());
        }
    }

    //method to import visitors from a file
    public void importVisitorsFromFile(String filePath) {
        Path path = Paths.get(filePath);
          if (!Files.exists(path)) { //checks if the file exists, I accidentally had a typo in the filepath, so I created this if statement
              System.err.println("File does not exist: " + path.toAbsolutePath());
            return;
        }
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line; //declaring String called line
            while ((line = reader.readLine()) != null) { //looping through every line
                Visitor visitor = Visitor.fromString(line.trim()); //creates visitor objects by calling fromString method for each line
                collectionOfVisitors.add(visitor); //I added them to the collectionOfVisitors linkedlist, if desired they can also be offered to the que
                System.out.println("Added visitor: " + visitor.getName());
            }
            System.out.println("Imported visitor data from file: " + path.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error reading file");
        }
    }

}
