public class Rupee extends Currency {
    public Rupee(int notes, int coins) {
        super(notes, coins);
    }

    public double toRuppee() {
        return compute();
    }

    public void print() {
        System.out.println("Rupee");
        super.print();
    }
}
