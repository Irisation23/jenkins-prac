package com.example.jenkinspr;

import com.example.jenkinspr.dto.IphoneRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class JenkinsPrApplicationTests {


    @Test
    void contextLoads() {

        IphoneRequestDto iphoneRequestDto = new IphoneRequestDto();

        iphoneRequestDto.setBattery(90L);

        Long battery = iphoneRequestDto.getBattery();

        if(battery.equals(90L)) {
            System.out.println("굿잡");
        }else {
            System.out.println("안굿잡");
        }

    }

    @Test
    void testHelloWorld() {

        String hello = "hello world";

        System.out.println(hello);

    }

}
