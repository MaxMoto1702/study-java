package name.maxserebryanskiy.study.jackson.domain;

import java.util.List;

/**
 * Created by m on 02.05.2015.
 */
public class Relocation {

    private Type type;
    private List<Area> area;

    public class Type {

        private String id;
        private String name;
    }
}
