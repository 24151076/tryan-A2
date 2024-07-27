public class Ride {
    private String rideName;
    private String attractionType; // Movie world tries to specify whether the attraction is a coaster, tower, show, etc.
    private String thrillLevel; // Movie world's thrill rating system, values include: Max, Moderate, and Mild
    private boolean isOpen;
    private Employee operator;

    // Default constructor
    public Ride() {
        this.rideName = "";
        this.attractionType = "";
        this.thrillLevel = "";
        this.operator = null;
        this.isOpen = false;
    }

    // Constructor with parameters
    public Ride(String rideName, String attractionType, String thrillLevel, Employee operator, boolean isOpen) {
        this.rideName = rideName;
        this.attractionType = attractionType;
        this.thrillLevel = thrillLevel;
        this.operator = operator;
        this.isOpen = isOpen;
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
}
