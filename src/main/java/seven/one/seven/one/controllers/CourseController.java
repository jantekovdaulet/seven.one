package seven.one.seven.one.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import seven.one.seven.one.models.Courses;
import seven.one.seven.one.services.CourseService;

import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(value = "/courses")
    public String getAddCourse(Model model) {
        List<Courses> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);
        return "courses";
    }

    @PostMapping(value = "/addcourse")
    public String addCourse(@RequestParam(name = "name") String name,
                            @RequestParam(name = "description") String description,
                            @RequestParam(name = "price") int price) {

        courseService.addCourse(new Courses(null, name, description, price));
        return "redirect:/courses";
    }

    @GetMapping(value = "/editcourse/{id}")
    public String getEditCourse(Model model,
                                @PathVariable(name = "id") Long id) {
        Courses course = courseService.getCourse(id);
        model.addAttribute("course", course);
        return "/editcourse";
    }

    @PostMapping(value = "/savecourse")
    public String saveCourse(@RequestParam(name = "id") Long id,
                             @RequestParam(name = "name") String name,
                             @RequestParam(name = "description") String description,
                             @RequestParam(name = "price") int price) {

        Courses course = courseService.getCourse(id);
        if (course != null) {
            course.setName(name);
            course.setDescription(description);
            course.setPrice(price);
            courseService.saveCourse(course);
        }
        return "redirect:/courses";
    }

    @PostMapping(value = "/deletecourse")
    public String saveCourse(@RequestParam(name = "id") Long id) {

        Courses course = courseService.getCourse(id);
        if (course != null) {
            courseService.deleteCourse(id);
        }
        return "redirect:/courses";
    }
}
