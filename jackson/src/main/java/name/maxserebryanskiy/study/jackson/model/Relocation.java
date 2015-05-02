package name.maxserebryanskiy.study.jackson.model;

/**
 * Created by JacksonGenerator on 02.05.15.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import name.maxserebryanskiy.study.jackson.domain.Area;

import java.util.List;


public class Relocation {
    @JsonProperty("area")
    private List<Area> area;
    @JsonProperty("type")
    private Type type;
}