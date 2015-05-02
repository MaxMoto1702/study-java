package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class Contact {
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("value")
    private Value value;
    @JsonProperty("preferred")
    private Boolean preferred;
}