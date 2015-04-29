package name.maxserebryanskiy.study.spring.social.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 28.04.2015.
 */
public class HHException extends Exception {

    private static final Logger LOG = LoggerFactory.getLogger(HHException.class);

    public HHException(String message) {
        super(message);
    }
}
