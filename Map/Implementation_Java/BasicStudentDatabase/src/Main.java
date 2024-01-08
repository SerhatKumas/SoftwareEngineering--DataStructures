import java.util.TreeMap;
import java.util.Map;

public class Main {
    //This project is developed to practise and understand map data structure
    /*
    Therefore, I didn't take best practise of software design serious, I mostly focused on usage
    of the map data structure
    */
    public static void main(String[] args) {
        //Database manager initialization
        StudentDatabaseManager studentDatabaseManager = new StudentDatabaseManager();

        //Database initialization
        Map<String, Student> school = new TreeMap<>();

        //Student adding to map
        studentDatabaseManager.addStudent(school, "12345678910", new Student("Dummy1", "Data1", "dummy1@gmail.com", 7534729741L));
        studentDatabaseManager.addStudent(school, "12345678911", new Student("Dummy2", "Data2", "dummy2@gmail.com", 7534729742L));
        studentDatabaseManager.addStudent(school, "12345678912", new Student("Dummy3", "Data3", "dummy3@gmail.com", 7534729743L));
        studentDatabaseManager.addStudent(school, "12345678913", new Student("Dummy4", "Data3", "dummy4@gmail.com", 7534729743L));

        System.out.println(studentDatabaseManager.allStudentToString(school));

        //Updating student record in map
        studentDatabaseManager.updateStudent(school, "12345678913",  new Student("Dummy4", "Data4", "dummy4@gmail.com", 7534729744L));

        System.out.println(studentDatabaseManager.allStudentToString(school));

        //Removing student from map
        studentDatabaseManager.removeStudent(school, "12345678911");

        //All student print out
        System.out.println(studentDatabaseManager.allStudentToString(school));

        //Checks whether student is existed or not
        System.out.println(studentDatabaseManager.isStudentExisted(school, "12345678911"));

        //Getting size of the map or number of student in school
        System.out.println(studentDatabaseManager.getNumberOfStudent(school));

        //Getting single record of information by id
        System.out.println(studentDatabaseManager.getStudentInformationById(school, "12345678910"));

        //Getting all the key values of the map
        System.out.println(studentDatabaseManager.allIdToString(school));
        
    }
}