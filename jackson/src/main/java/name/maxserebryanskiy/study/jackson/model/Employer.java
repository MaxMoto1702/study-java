package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;


public class Employer {
    @JsonProperty("logo_urls")
    private LogoUrls logoUrls;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("alternate_url")
    private String alternateUrl;
    @JsonProperty("url")
    private String url;
}