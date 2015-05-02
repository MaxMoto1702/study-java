package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class Value {
    @JsonProperty("country")
    private String country;
    @JsonProperty("number")
    private String number;
    @JsonProperty("city")
    private String city;
}