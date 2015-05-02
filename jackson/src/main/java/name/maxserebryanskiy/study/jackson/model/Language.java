package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class Language {
    @JsonProperty("level")
    private Level level;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;

    public class Level {
        @JsonProperty("name")
        private String name;
        @JsonProperty("id")
        private String id;
    }
}