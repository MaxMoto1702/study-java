package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class Salary {
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("currency")
    private String currency;
}