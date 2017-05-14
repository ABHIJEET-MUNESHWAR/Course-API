package io.javabrains.springbootquickstart.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created using IntelliJ IDEA
 * Author:  abhijeetmuneshwar
 * Date:    14/05/17
 * Time:    10:02 PM
 */

@RestController
public class TopicController {

    @RequestMapping ("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring Framework", "Spring Framework Description"),
                new Topic("Java", "Java Framework", "Java Framework Description"),
                new Topic("JavaScript", "JavaScript Framework", "JavaScript Framework Description")
        );
    }
}
