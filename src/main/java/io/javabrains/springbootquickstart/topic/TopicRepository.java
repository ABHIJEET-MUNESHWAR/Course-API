package io.javabrains.springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;

/**
 * Created using IntelliJ IDEA
 * Author:  abhijeetmuneshwar
 * Date:    17/05/17
 * Time:    10:07 AM
 */
public interface TopicRepository extends CrudRepository<Topic, String> {
}
