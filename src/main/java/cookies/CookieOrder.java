package cookies;

public class CookieOrder {
    private int numBoxes;

    public CookieOrder(String variety, int localNumBoxes) {
        this.numBoxes =localNumBoxes;
    }


    public int getNumBoxes() {
        return this.numBoxes;
    }
}
