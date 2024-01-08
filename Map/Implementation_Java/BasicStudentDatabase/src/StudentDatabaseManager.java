import java.util.Map;

public class StudentDatabaseManager {

    public void addStudent(Map<String, Student> school, String id, Student student){
        if (!isStudentExisted(school, id)){school.put(id, student);}
        else {
            System.out.println("This student is already enrolled in school");
        }
    }

    public void removeStudent(Map<String, Student> school, String id){
        if (isStudentExisted(school, id)){school.remove(id);}
        else {
            System.out.println("Student with given id does not exist in this school");
        }
    }

    public void updateStudent(Map<String, Student> school, String id, Student newStudent){
        if (isStudentExisted(school, id)){school.replace(id, newStudent);}
        else {
            System.out.println("Student with given id does not exist in this school");
        }
    }

    public String allIdToString(Map<String, Student> school){
        return school.keySet().toString();
    }

    public String allStudentToString(Map<String, Student> school){
        return school.values().toString();
    }

    public String getStudentInformationById(Map<String, Student> school, String id){
        if (isStudentExisted(school, id)){return school.get(id).toString();}
        else {
            return "Student with given id does not exist in this school";
        }
    }

    public boolean isStudentExisted(Map<String, Student> school, String id){
        return school.containsKey(id);
    }

    public int getNumberOfStudent(Map<String, Student> school){
        return school.size();
    }

}
