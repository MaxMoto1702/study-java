package name.maxserebryanskiy.study.spring.start;

import name.maxserebryanskiy.study.spring.start.component.MessagePrinter;
import name.maxserebryanskiy.study.spring.start.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!!!";
            }
        };
    }
}
