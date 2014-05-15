package nl.pvanassen.steam.error;


/**
 * Steam guard authentication is needed
 * 
 * @author Paul van Assen
 */
public class SteamGuardException extends SteamException {

    /**
     * Steam guard login
     */
    public SteamGuardException() {
        super("Steam guard authentication needed");
    }
}
