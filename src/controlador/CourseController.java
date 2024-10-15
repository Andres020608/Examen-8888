package controlador;

import modelo.Course;
import modelo.Teacher;
import vista.viewCourse;

import java.util.List;

public class CourseController {
    private viewCourse view;

    public CourseController(viewCourse view) {
        this.view = view;
    }
    public void insertNewCourse(Course newCourse) {
        Course.insertCourse(newCourse);
        view.getMostrarMensage("\nCourse guardado");
    }
    public void displayAllCourses() {
        List<Course> courses = Course.getAllCourses() ;
        view.displayListCourses(courses);
    }

}


