public class Visitor extends Person {
    private String ticketType;
    private boolean hasPass; // simplified to a boolean, could be changed to a string in future if different passes were desired

    // Default constructor
    public Visitor() {
        super();
        this.ticketType = "";
        this.hasPass = false;
    }

    // Constructor with parameters
    public Visitor(String fullName, int age, String gender, String ticketType, boolean hasPass) {
        super(fullName, age, gender);
        this.ticketType = ticketType;
        this.hasPass = hasPass;
    }

    // Getters and Setters
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean hasPass() {
        return hasPass;
    }

    public void setHasPass(boolean hasPass) {
        this.hasPass = hasPass;
    }
}
