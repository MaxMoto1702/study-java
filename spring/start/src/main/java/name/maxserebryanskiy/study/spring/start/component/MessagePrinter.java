package name.maxserebryanskiy.study.spring.start.component;

import name.maxserebryanskiy.study.spring.start.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by m on 29.04.2015.
 */
@Component
public class MessagePrinter {

    @Autowired
    private MessageService service;

    public void printMessage() {
        System.out.println(service.getMessage());
    }
}
