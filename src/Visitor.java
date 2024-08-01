public class Visitor extends Person {
    private boolean hasPass;
    private boolean hasFastTrack; // used to skip queue lines at movieworld

    // Default constructor
    public Visitor() {
        super();
        this.hasPass = false;
        this.hasFastTrack = false;
    }

    // Constructor with parameters
    public Visitor(String name, int age, String gender, boolean hasPass, boolean hasFastTrack) {
        super(name, age, gender);
        this.hasPass = hasPass;
        this.hasFastTrack = hasFastTrack;
    }

    // Getters and Setters
    public boolean hasPass() {
        return hasPass;
    }

    public void setHasPass(boolean hasPass) {
        this.hasPass = hasPass;
    }

    public boolean hasFastTrack() {
        return hasFastTrack;
    }

    public void setHasFastTrack(boolean hasFastTrack) {
        this.hasFastTrack = hasFastTrack;
    }

    public String toString() { //custom creating my string representation, visitor details
        return "Visitor{name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + ", hasPass=" + hasPass + ", hasFastTrack=" + hasFastTrack + '}';
    }
}
