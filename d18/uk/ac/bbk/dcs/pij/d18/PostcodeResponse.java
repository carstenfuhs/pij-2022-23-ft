package uk.ac.bbk.dcs.pij.d18;

/**
 * Class for deserialised objects from JSON response data for GET calls to
 * https://api.postcodes.io/postcodes/some_postcode
 */
public class PostcodeResponse {
    /** HTTP status code. */
    private int status;

    /** The actual payload data. */
    private PostcodeContent result;

    @Override
    public String toString() {
        return "PostcodeResponse{" +
                "status=" + status +
                ", result=" + result +
                '}';
    }
}
