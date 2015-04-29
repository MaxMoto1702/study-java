package name.maxserebryanskiy.study.spring.rest.service.domain;

import java.util.Calendar;

/**
 * Created by m on 29.04.2015.
 */
public class MyDataObject {

    private Calendar time;
    private String message;

    public MyDataObject(Calendar time, String message) {
        this.time = time;
        this.message = message;
    }

    public MyDataObject() {
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
