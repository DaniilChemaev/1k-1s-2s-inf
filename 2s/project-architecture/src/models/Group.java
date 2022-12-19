package models;

public class Group {
    private long ID;
    private String name;
    private int subscribers;

    public Group() {
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    public long getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Group{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", subscribers=" + subscribers +
                '}';
    }
}
