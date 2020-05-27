package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter bean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldSendPackageAndGetAnyMessage() {
        String result = bean.sendPackage("test1",29);
        Assertions.assertNotNull(result);
    }
    @Test
    public void shouldSendPackageAndGetCorrectMessage() {
        String result = bean.sendPackage("test1",29);
        Assertions.assertEquals("Package delivered to: test1", result);
    }
    @Test
    public void shouldSendPackageandAndGetFailedMessage() {
        String result = bean.sendPackage("test2",31);
        Assertions.assertEquals("Package not delivered to: test2", result);
    }
    @Test
    public void shouldSendPackageandAndGetCorrectMessage_v2() {
        String result = bean.sendPackage("test22",30);
        Assertions.assertEquals("Package delivered to: test22", result);
    }
    @Test
    public void shouldSendPackageandAndGetFailedMessageWithMinusWeight() {
        String result = bean.sendPackage("test22",-1);
        Assertions.assertEquals("Package not delivered to: test22", result);
    }
    @Test
    public void shouldSendPackageandAndGetCorredtMessageWithZero() {
        String result = bean.sendPackage("test22",0);
        Assertions.assertEquals("Package delivered to: test22", result);
    }
    @Test
    public void shouldSendPackageandAndGetCorredtMessageWithNull() {
        String result = bean.sendPackage(null,0);
        Assertions.assertEquals("Package delivered to: " + null, result);
    }


}