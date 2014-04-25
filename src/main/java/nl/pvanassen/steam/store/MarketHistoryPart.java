package nl.pvanassen.steam.store;

import java.util.Date;

/**
 * Class for tracking lising created/removed
 * 
 * @author Paul van Assen
 */
public class MarketHistoryPart {
    private final String steamId;
    private final String name;
    private final String gameName;
    private final Date listed;
    private final Date acted;
    private final int price;
    private final MarketHistoryStatus status;

    MarketHistoryPart(String steamId, String name, String gameName, Date listed, Date acted, int price,
            MarketHistoryStatus status) {
        super();
        this.steamId = steamId;
        this.name = name;
        this.gameName = gameName;
        this.listed = listed;
        this.acted = acted;
        this.price = price;
        this.status = status;
    }

    /**
     * @return the steamId
     */
    public String getSteamId() {
        return steamId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @return the listed
     */
    public Date getListed() {
        return listed;
    }

    /**
     * @return the acted
     */
    public Date getActed() {
        return acted;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return the status
     */
    public MarketHistoryStatus getStatus() {
        return status;
    }

}
