package com.kodilla.spring.basic.spring_scopes.homework;

import java.time.LocalTime;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("single")
public class Clock {

    public Clock(){
        LocalTime time = LocalTime.now();
        System.out.println(time);

    }


}
