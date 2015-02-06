/**
 *
 */
package nl.pvanassen.steam.store.marketpage;

import java.io.IOException;
import java.util.Set;

import nl.pvanassen.steam.error.SteamException;
import nl.pvanassen.steam.http.Http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Paul van Assen
 */
public class SteamMarketPageService implements MarketPageService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final Http http;
    private final String username;

    /**
     * @param http For mocking
     * @param username The username of the owner of this service. This is used
     *            to calculate the referer
     */
    public SteamMarketPageService(Http http, String username) {
        this.http = http;
        this.username = username;
    }

    @Override
    public Set<Integer> getAppIds() {
        logger.info("Getting market page for app ids");
        AppIdsHandle handle = new AppIdsHandle();
        try {
            http.get("http://steamcommunity.com/market/", handle);
        }
        catch (IOException e) {
            logger.error("Error getting outstanding listings", e);
        }
        return handle.getAppIds();
    }

    /**
     * {@inheritDoc}
     *
     * @see nl.pvanassen.steam.store.marketpage.MarketPageService#getMarketPage()
     */
    @Override
    public MarketPage getMarketPage() {
        logger.info("Getting market page for " + username);
        MarketPageHandle handle = new MarketPageHandle();
        try {
            http.get("http://steamcommunity.com/market/", handle);
        }
        catch (IOException e) {
            logger.error("Error getting the market page", e);
            throw new SteamException("Error getting the market page", e);
        }
        if (handle.isError()) {
            throw new SteamException("Error getting the market page, unknown error");
        }
        return handle.getOutstandings();
    }


}
