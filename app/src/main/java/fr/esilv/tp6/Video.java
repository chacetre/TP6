package fr.esilv.tp6;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Charlotte on 26/02/2016.
 */
public class Video {

    @JsonProperty("kind")
    public String kind ;
    @JsonProperty("etag")
    public String eTag;
    @JsonProperty("nextPageToken")
    public String nextPageToken ;
    @JsonProperty("prevPageToken")
    public String prevPageToken;
    public String regionCode;

    @JsonProperty("items")
    public YoutubeVideo[] items;

}
