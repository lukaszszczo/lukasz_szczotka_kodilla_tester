package com.kodilla.spring.basic.spring_scopes.homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class ClockTestSuite {

    @Test
    public void shouldCreateBeans() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock bean = context.getBean(Clock.class);
        Clock bean1 = context.getBean(Clock.class);
        Clock bean2 = context.getBean(Clock.class);
        Clock bean3 = context.getBean(Clock.class);
        Clock bean4 = context.getBean(Clock.class);
        Clock bean5 = context.getBean(Clock.class);
        Clock bean6= context.getBean(Clock.class);
        Clock bean7= context.getBean(Clock.class);
        Clock bean8= context.getBean(Clock.class);
        Clock bean9= context.getBean(Clock.class);
        Clock bean10= context.getBean(Clock.class);
        Clock bean11= context.getBean(Clock.class);
        Clock bean12= context.getBean(Clock.class);
        Clock bean13= context.getBean(Clock.class);
        Clock bean14= context.getBean(Clock.class);
        Clock bean15= context.getBean(Clock.class);
        Clock bean16= context.getBean(Clock.class);
        Clock bean17= context.getBean(Clock.class);
        Clock bean18= context.getBean(Clock.class);
        Clock bean19= context.getBean(Clock.class);
        Clock bean20= context.getBean(Clock.class);
        Clock bean21= context.getBean(Clock.class);
        Clock bean22= context.getBean(Clock.class);
        Clock bean23= context.getBean(Clock.class);

        Assertions.assertNotEquals(bean, bean1);
        Assertions.assertNotEquals(bean, bean23);
        Assertions.assertNotEquals(bean1, bean22);
        Assertions.assertNotEquals(bean5, bean6);


    }

}