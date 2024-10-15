package vista;

import interfaces.IMostrarMensage;
import modelo.Course;

import java.util.List;

public class viewCourse implements IMostrarMensage {
        public void displayListCourses(List<Course> courses) {
            System.out.println("\nImprimiendo lista de Course: " );
            for (Course course : courses) {
                System.out.println("Id del course: " + course.getId()+ " Name del course: " + course.getName()+ " content del course: " + course.getContent()+ " status del course: " + course.getStatus()+ " id del teacher : " + course.getTeacherId());
            }

        }
    }

