package io.javabrains.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created using IntelliJ IDEA
 * Author:  abhijeetmuneshwar
 * Date:    14/05/17
 * Time:    9:44 PM
 */

@RestController
public class HelloController {

    @RequestMapping ("/hello")
    public String sayHi(){
        return "Hi";
    }
}
