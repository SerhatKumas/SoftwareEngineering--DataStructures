import java.util.LinkedList;
import java.util.List;

public class CvManager {
    public GraphNode createCv(String nameOfThePerson) {

        //Person Creations
        GraphNode person = new GraphNode(nameOfThePerson, new LinkedList<GraphNode>());

        //Cv Creation
        GraphNode school = new GraphNode("school", new LinkedList<GraphNode>());
        GraphNode certification = new GraphNode("certification", new LinkedList<GraphNode>());
        GraphNode reference = new GraphNode("reference", new LinkedList<GraphNode>());
        GraphNode job = new GraphNode("job", new LinkedList<GraphNode>());

        person.adjacencyList.add(school);
        person.adjacencyList.add(certification);
        person.adjacencyList.add(reference);
        person.adjacencyList.add(job);

        return person;
    }

    //Adding nodes to the cv parts
    public void addSchoolRecord(GraphNode cv, String schoolName) {
        for (int i = 0; i < cv.adjacencyList.size(); i++) {
            if (cv.adjacencyList.get(i).value.equals("school")) {
                cv.adjacencyList.get(i).adjacencyList.add(new GraphNode(schoolName, null));
            }
        }
    }

    //Adding nodes to the cv parts
    public void addCertificate(GraphNode cv, String certificate) {
        for (int i = 0; i < cv.adjacencyList.size(); i++) {
            if (cv.adjacencyList.get(i).value.equals("certification")) {
                cv.adjacencyList.get(i).adjacencyList.add(new GraphNode(certificate, null));
            }
        }
    }

    //Adding nodes to the cv parts
    public void addReference(GraphNode cv, String reference) {
        for (int i = 0; i < cv.adjacencyList.size(); i++) {
            if (cv.adjacencyList.get(i).value.equals("reference")) {
                cv.adjacencyList.get(i).adjacencyList.add(new GraphNode(reference, null));
            }
        }
    }

    //Adding nodes to the cv parts
    public void addJobExperience(GraphNode cv, String jobExperience) {
        for (int i = 0; i < cv.adjacencyList.size(); i++) {
            if (cv.adjacencyList.get(i).value.equals("job")) {
                cv.adjacencyList.get(i).adjacencyList.add(new GraphNode(jobExperience, null));
            }
        }
    }

    //Moving through the nodes -> tree by tree
    public String displayCv(GraphNode cv) {
        StringBuilder cvToString = new StringBuilder();
        cvToString.append("Cv Owner : ").append(cv.value).append("\n");
        List<GraphNode> cvParts = cv.adjacencyList;
        for (GraphNode cvPart : cvParts) {
            for (int j = 0; j < cvPart.adjacencyList.size(); j++) {
                cvToString.append(cvPart.value).append(" : ").append(cvPart.adjacencyList.get(j).value).append("\n");
            }
        }
        return cvToString.toString();
    }

}
