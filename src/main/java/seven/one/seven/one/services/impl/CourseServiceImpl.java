package seven.one.seven.one.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seven.one.seven.one.models.Courses;
import seven.one.seven.one.repositories.CourseRepository;
import seven.one.seven.one.services.CourseService;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Courses getCourse(Long id) {
        return courseRepository.getOne(id);
    }

    @Override
    public List<Courses> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Courses addCourse(Courses course) {
        return courseRepository.save(course);
    }

    @Override
    public Courses saveCourse(Courses course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
