package nl.pvanassen.steam.store.buy;

/**
 * Result of a purchase attempt
 *
 * @author Paul van Assen
 */
public class BuyResult {

    private final boolean success;
    private final int wallet;
    private final String message;

    BuyResult(boolean success, int wallet, String message) {
        super();
        this.success = success;
        this.wallet = wallet;
        this.message = message;
    }

    /**
     * @return The error message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the wallet
     */
    public int getWallet() {
        return wallet;
    }

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * {@inheritDoc}
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "BuyResult [success=" + success + ", wallet=" + wallet + "]";
    }

}
