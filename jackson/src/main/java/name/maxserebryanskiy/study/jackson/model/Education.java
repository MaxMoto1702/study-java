package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Education {
    @JsonProperty("attestation")
    private List<Item> attestation;
    @JsonProperty("level")
    private Level level;
    @JsonProperty("additional")
    private List<Item> additional;
    @JsonProperty("elementary")
    private List<Item> elementary;
    @JsonProperty("primary")
    private List<Item> primary;

    public class Level {
        @JsonProperty("name")
        private String name;
        @JsonProperty("id")
        private String id;
    }

    public class Item {
        @JsonProperty("result")
        private String result;
        @JsonProperty("year")
        private Integer year;
        @JsonProperty("result_id")
        private JSONObject$Null resultId;
        @JsonProperty("organization_id")
        private JSONObject$Null organizationId;
        @JsonProperty("organization")
        private String organization;
        @JsonProperty("name")
        private String name;
        @JsonProperty("name_id")
        private JSONObject$Null nameId;
    }
}