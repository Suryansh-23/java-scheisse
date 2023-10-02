public class CollectionBox {
    private double sum;

    public CollectionBox() {
        sum = 0;
    }

    public void addCurrency(Currency currency) {
        sum += currency.toRuppee();
    }

    public void print() {
        System.out.println("Total: " + sum);
    }

    public static void main(String[] args) {
        CollectionBox box = new CollectionBox();
        box.addCurrency(new Dollar(10, 25));
        box.addCurrency(new Pound(5, 50));
        box.addCurrency(new Rupee(100, 0));
        box.print();
    }
}