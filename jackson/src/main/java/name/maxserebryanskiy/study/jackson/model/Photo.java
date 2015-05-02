package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class Photo {

    @JsonProperty("small")
    private String small;
    @JsonProperty("100")
    private String s100;
    @JsonProperty("500")
    private String s500;
    @JsonProperty("medium")
    private String medium;
    @JsonProperty("id")
    private String id;
    @JsonProperty("40")
    private String s40;
}