package seven.one.seven.one.services;

import seven.one.seven.one.models.Courses;

import java.util.List;

public interface CourseService {

    Courses getCourse(Long id);
    List<Courses> getAllCourses();
    Courses addCourse(Courses course);
    Courses saveCourse(Courses course);
    void deleteCourse(Long id);

}
