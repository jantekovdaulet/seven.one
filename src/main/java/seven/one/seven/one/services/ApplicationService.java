package seven.one.seven.one.services;

import seven.one.seven.one.models.ApplicationRequest;
import seven.one.seven.one.models.Courses;

import java.util.List;

public interface ApplicationService {

    ApplicationRequest addApplication(ApplicationRequest application);
    List<ApplicationRequest> getAllApplications();
    ApplicationRequest getApplication(Long id);
    void deleteApplication(ApplicationRequest application);
    ApplicationRequest saveApplication(ApplicationRequest application);
    List<ApplicationRequest> getNewApplications();
    List<ApplicationRequest> getOldApplications();

    Courses getCourse(Long id);
    List<Courses> getAllCourses();
    Courses addCourse(Courses course);
    Courses saveCourse(Courses course);

}
