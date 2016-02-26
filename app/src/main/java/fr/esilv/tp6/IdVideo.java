package fr.esilv.tp6;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Charlotte on 26/02/2016.
 */
public class IdVideo {

    @JsonProperty("kind")
    public String kind ;
    @JsonProperty("videoId")
    public String videoId;
}
