public class Dollar extends Currency {
    public Dollar(int notes, int coins) {
        super(notes, coins);
    }

    public double toRuppee() {
        return compute() * 50;
    }

    public void print() {
        System.out.println("Dollar");
        super.print();
    }
}
