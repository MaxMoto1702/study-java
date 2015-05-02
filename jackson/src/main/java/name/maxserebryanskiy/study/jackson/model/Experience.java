package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 * Опыт работы
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import name.maxserebryanskiy.study.jackson.domain.Area;

import java.util.Calendar;
import java.util.List;


public class Experience {
    @JsonProperty("area")
    private Area area;
    @JsonProperty("company_id")
    private String companyId;
    @JsonProperty("industries")
    private List<Industry> industries;
    @JsonProperty("start")
    private Calendar start;
    @JsonProperty("description")
    private String description;
    @JsonProperty("employer")
    private Employer employer;
    @JsonProperty("end")
    private Calendar end;
    @JsonProperty("company_url")
    private String companyUrl;
    @JsonProperty("industry")
    private Object industry;
    @JsonProperty("company")
    private String company;
    @JsonProperty("position")
    private String position;
}