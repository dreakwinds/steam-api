/**
 * 
 */
package nl.pvanassen.steam.store.listing;

import java.util.List;

import nl.pvanassen.steam.store.common.Listing;

/**
 * @author Paul van Assen
 *
 */
public interface ListingService {
    /**
     * Retrieve the newly listed
     * 
     * @param currency Currency to retrieve
     * @param country Country to get listings for
     * @return Listings
     */
    List<Listing> getNewlyListed(int currency, String country);

    /**
     * Retrieve all newly listed
     * @param currency Currency to retrieve
     * @param country Country to get listings for
     * 
     * @param queue Queue to add the items to
     */
    void getAsyncNewlyListed(int currency, String country, ListingDeque queue);

}
