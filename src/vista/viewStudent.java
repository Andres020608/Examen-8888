package vista;

import interfaces.IMostrarMensage;
import modelo.Student;
import java.util.List;

public class viewStudent implements IMostrarMensage {
    public void displayListStudents(List<Student> students) {
        System.out.println("\nImprimiendo lista de estudiantes");
        for (Student student : students) {
            System.out.println("Id del estudiante: " + student.getId()+ " Name del estudiante: " + student.getName()+ " Email del estudiante: " + student.getEmail());
        }

    }
}
