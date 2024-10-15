package vista;

import interfaces.IMostrarMensage;
import modelo.Teacher;

import java.util.List;

public class viewTeacher implements IMostrarMensage {
        public void displayListTeachers(List<Teacher> teachers) {
            System.out.println("\nImprimiendo lista de profesores");
            for (Teacher teacher : teachers) {
                System.out.println("Id del teacher: " + teacher.getId()+ " Name del teacher: " + teacher.getName()+ " rol del teacher: " + teacher.getRole());
            }

        }


}
