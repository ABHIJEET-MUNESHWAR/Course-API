 package io.javabrains.springbootquickstart.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

 /**
 * Created using IntelliJ IDEA
 * Author:  abhijeetmuneshwar
 * Date:    17/05/17
 * Time:    10:07 AM
 */
public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);
}