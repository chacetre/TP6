package fr.esilv.tp6.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Charlotte on 26/02/2016.
 */
public class Snippet {
    @JsonProperty("publishedAt")
    public String publishedAt;
    @JsonProperty("channelId")
    public String channelId;
    @JsonProperty("title")
    public String title;
    @JsonProperty("description")
    public String description;
    @JsonProperty("thumbnails")
    public Thumbnails thumbnails;
    public String channelTitle;
    public String liveBroadcastContent;

    public class Thumbnails  implements Serializable {
        @JsonProperty("default")
        public UrlInfo defaut;
        public UrlInfo medium;
        public UrlInfo high;

        public class UrlInfo  implements Serializable {
            public String url;
            public Integer width;
            public Integer height;

        }
    }
}
