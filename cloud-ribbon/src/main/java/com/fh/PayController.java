package com.fh;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("pays")
public class PayController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    @HystrixCommand(fallbackMethod = "fgh")
    public boolean sahi() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String s = restTemplate.getForObject("http://cloud-user2/users?id=123456", String.class);
        System.out.println(s);
        return true;
    }
    public boolean fgh(){
        System.out.println("降级了");
        return false;
    }
}
