package fr.esilv.tp6;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Charlotte on 26/02/2016.
 */
public class YoutubeVideo {

    @JsonProperty("kind")
    public String kind ;
    @JsonProperty("etag")
    public String eTag;
    @JsonProperty("snippet")
    public Snippet snippet;
    @JsonProperty("id")
    public IdVideo id;


}
