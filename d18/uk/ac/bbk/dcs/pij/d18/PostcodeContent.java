package uk.ac.bbk.dcs.pij.d18;

/**
 * The fields of this class represent the interesting fields of the result
 * component of JSON response data for GET calls to
 * https://api.postcodes.io/postcodes/some_postcode
 */
public class PostcodeContent {

    private String postcode, region;
    private double latitude, longitude;

    @Override
    public String toString() {
        return "PostcodeContent{" +
                "postcode='" + postcode + '\'' +
                ", region='" + region + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
