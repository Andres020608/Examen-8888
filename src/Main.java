import controlador.CourseController;
import controlador.TeacherController;
import db.connection;
import modelo.Course;
import modelo.Student;
import modelo.Teacher;
import vista.viewCourse;
import vista.viewStudent;
import controlador.StudentController;
import vista.viewTeacher;

public class Main {
    public static void main(String[] examen ){
        connection.getConnection();
        System.out.println("Bienvenido");

        //Inicializamos la vista student
        viewStudent viewStudent = new viewStudent();
        //inicializamos el controlador student
        StudentController studentController = new StudentController(viewStudent);
        //mostramos datos en la vista
        studentController.displayAllStudents();

        //inicalizar objeto estudiante
        //Student newStudent= new Student(4, "Carmen", "Carmen@gmail.com");

        //insertar estudiante en la base de datos
        //studentController.insertnewStudent(newStudent);


        //Profesores
        viewTeacher viewTeacher = new viewTeacher();
        TeacherController teacherController = new TeacherController(viewTeacher);
        //Teacher newTeacher = new Teacher(1, "Pedro", "Sociales");
        //teacherController.insertNewTeacher(newTeacher);
        teacherController.displayAllTeachers();

        //Courses
        viewCourse viewCourse = new viewCourse();
        CourseController courseController = new CourseController(viewCourse);
        //Course newCourse = new Course(1, "Programacion", "POO", true, 3);
        //courseController.insertNewCourse(newCourse);
        courseController.displayAllCourses();
    }
}
