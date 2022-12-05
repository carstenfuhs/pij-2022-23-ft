package uk.ac.bbk.dcs.pij.d18;

/**
 * Represents JSON data for POST request to http://api.postcodes.io/postcodes
 */
public class ManyPostcodesQueryData {

    /** An array of Strings holds the actual payload data. */
    private String[] postcodes;

    /**
     * @param postcodes reference to be stored inside this object
     */
    public ManyPostcodesQueryData(String[] postcodes) {
        this.postcodes = postcodes;
    }
}
