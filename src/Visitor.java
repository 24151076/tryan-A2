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

    public String toString() { //custom creating my string representation, visitor details in CSV format
        return getName() + "," + getAge() + "," + getGender() + "," + hasPass + "," + hasFastTrack;
    }

    public static Visitor fromString(String str) { //creating fromString method to create Visitor objects from strings

        //splits the string by commas
        String[] parts = str.split(",");
        String name = parts[0];
        int age = Integer.parseInt(parts[1]);
        String gender = parts[2];
        boolean hasPass = Boolean.parseBoolean(parts[3]);
        boolean hasFastTrack = Boolean.parseBoolean(parts[4]);

        return new Visitor(name, age, gender, hasPass, hasFastTrack);
    }
}
