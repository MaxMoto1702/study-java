package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class Specialization {
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("profarea_id")
    private String profareaId;
    @JsonProperty("profarea_name")
    private String profareaName;
}