public class Pound extends Currency {
    public Pound(int notes, int coins) {
        super(notes, coins);
    }

    public double toRuppee() {
        return compute() * 78;
    }

    public void print() {
        System.out.println("Pound");
        super.print();
    }
}