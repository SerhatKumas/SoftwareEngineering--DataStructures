import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //I developed this project to understand how I can use graph data structure logic. This project resembled a graph to me like Facebook or linked-In

        //Cv Manager
        CvManager manager = new CvManager();

        //Cv Creation
        GraphNode cvChase = manager.createCv("Chase");

        //Determined cv parts are getting added to Cv
        manager.addSchoolRecord(cvChase, "High School Name");
        manager.addSchoolRecord(cvChase, "Bachelors Uni Name");
        manager.addSchoolRecord(cvChase, "Masters Uni Name");

        manager.addCertificate(cvChase, "Technology Cert");
        manager.addCertificate(cvChase, "Management Cert");
        manager.addCertificate(cvChase, "Self Improvement Cert");

        manager.addReference(cvChase, "Supervisor Name");
        manager.addReference(cvChase, "Professor Name");
        manager.addReference(cvChase, "CO-founder Name");

        manager.addJobExperience(cvChase, "Company A Name");
        manager.addJobExperience(cvChase, "Company B Name");
        manager.addJobExperience(cvChase, "Company C Name");

        //Displaying the cv
        System.out.println(manager.displayCv(cvChase));

        //Maybe evaluating cv can be implemented by using the number of the total node or number of nodes in each part of the cv

    }
}