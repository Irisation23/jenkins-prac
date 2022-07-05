package com.example.jenkinspr;

import com.example.jenkinspr.dto.IphoneRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsPrApplicationTests {


    @Test
    void contextLoads() {

        IphoneRequestDto iphoneRequestDto = new IphoneRequestDto();

        iphoneRequestDto.setBattery(90L);

        Long battery = iphoneRequestDto.getBattery();

        if(battery.equals(90L)) {
            System.out.println("굿");
        }

    }

}
