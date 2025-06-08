package Library_App;

public class Condition {

    boolean isBorrowed;
    boolean isReturned;

    public Condition(boolean isBorrowed, boolean isReturned) {
        this.isBorrowed = isBorrowed;
        this.isReturned = isReturned;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }
}
