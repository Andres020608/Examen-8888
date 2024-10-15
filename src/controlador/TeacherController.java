package controlador;

import modelo.Teacher;
import vista.viewTeacher;
import java.util.List;

public class TeacherController {

private viewTeacher view;

public TeacherController(viewTeacher view) {
    this.view = view;
    }
    public void insertNewTeacher(Teacher newteacher) {
        Teacher.insertTeacher(newteacher);
        view.getMostrarMensage("\nTeacher guardado");
    }
    public void displayAllTeachers() {
        List<Teacher> teachers = Teacher.getAllTeachers() ;
        view.displayListTeachers(teachers);
    }

}
