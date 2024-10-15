package controlador;

import modelo.Student;
import vista.viewStudent;

import java.util.List;

public class StudentController {
    private viewStudent view;

    public StudentController(viewStudent view) {
        this.view = view;
    }
public void insertnewStudent(Student newstudent) {
        Student.inserStudent(newstudent);
        view.getMostrarMensage("\nEstudiante guardado");
}
    public void displayAllStudents() {
        List<Student> students = Student.getAllStudents();
        view.displayListStudents(students);
    }
}
