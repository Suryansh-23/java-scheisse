/**
 * This abstract class represents a currency with notes and coins.
 */
abstract class Currency {
    protected int notes, coins;

    /**
     * Constructs a currency object with the given number of notes and coins.
     * @param notes the number of notes
     * @param coins the number of coins
     */
    public Currency(int notes, int coins) {
        this.notes = notes;
        this.coins = coins;
    }

    /**
     * Prints the number of notes and coins.
     */
    public void print() {
        System.out.println("Notes: " + notes);
        System.out.println("Coins: " + coins);
    }

    /**
     * Converts the currency to rupees.
     * @return the currency in rupees
     */
    public abstract double toRuppee();

    /**
     * Computes the total value of the currency in rupees.
     * @return the total value of the currency in rupees
     */
    public double compute() {
        return notes + coins / 100.0;
    }
}