package collection;

public class Traveller {

    static vechile v;

    public void setV(vechile v) {
        this.v = v;
    }

    public static void main(String[] args) {

        Traveller t = new Traveller();
        t.setV(new Car());
       // t.setV(new Bike());
        v.start();
    }
}
