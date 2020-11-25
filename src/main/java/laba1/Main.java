package laba1;

import laba1.service.Test;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

//@ComponentScan("laba1")
public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext("laba1");
        Test test = context.getBean(Test.class);
        test.startTest();
    }
}

