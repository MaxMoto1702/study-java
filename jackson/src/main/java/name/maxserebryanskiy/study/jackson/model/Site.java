package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class Site {
    @JsonProperty("type")
    private Type type;
    @JsonProperty("url")
    private String url;
}