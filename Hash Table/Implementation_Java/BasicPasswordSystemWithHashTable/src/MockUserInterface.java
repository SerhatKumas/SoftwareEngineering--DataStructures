import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import java.util.Scanner;

public class MockUserInterface {

    /*
    This project is not the best practise for user interface management but main reason to code
    project was to practise hash table data structure and hashing so thats why I coded this
    */

    //Dao level manager
    private final PasswordDAO pm = new PasswordDAO();

    //Main interface runner methods
    public void startUserInterface() throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        while(true){
          printUserInterfaceMethod();
          int choice = sc.nextInt();
          switch (choice){
              case 1 :
                  System.out.print("Username : ");
                  String usernameCreate = sc.next();
                  System.out.print("Password : ");
                  String passwordCreate = sc.next();
                  System.out.print("Password Again : ");
                  String passwordAgainCreate = sc.next();
                  if (passwordCreate.equals(passwordAgainCreate)){
                      createNewAccount(usernameCreate, passwordCreate);
                  }
                  else {
                      System.out.println("Passwords does not match");
                  }
                  break;
              case 2:
                  System.out.print("Username : ");
                  String usernameLogin = sc.next();
                  System.out.print("Password : ");
                  String passwordLogin = sc.next();
                  loginAccount(usernameLogin, passwordLogin);
                  break;
              case 3:
                  System.out.print("Username : ");
                  String usernameDelete = sc.next();
                  System.out.print("Password : ");
                  String passwordDelete = sc.next();
                  deleteAccount(usernameDelete, passwordDelete);
                  break;
              case 4:
                  System.out.println("Goodbye");
                  closeApplication();
                  break;
              default:
                  System.out.println("Enter valid choice of transaction");
                  break;
          }
        }
    }

    //Corresponding methods that user want to do
    private void printUserInterfaceMethod(){
        System.out.println("User Interface Methods");
        System.out.println("----------------------");
        System.out.println("1) Create a new account");
        System.out.println("2) Login to account");
        System.out.println("3) Delete a account");
        System.out.println("4) Close the application");
        System.out.println("----------------------");
        System.out.println("Enter your choice : ");
    }

    //Checks input values taken from the user and activates requested method
    private void createNewAccount(String username, String password) throws NoSuchAlgorithmException {
        if (!Objects.equals(username, "") && !Objects.equals(username, "")){
            pm.addRecord(username,password);
        }
        else{
            System.out.println("Please enter valid username or password");
        }

    }

    //Checks input values taken from the user and activates requested method
    private void loginAccount(String username, String password) throws NoSuchAlgorithmException {
        if (!Objects.equals(username, "") && !Objects.equals(username, "")){
            pm.accessRecord(username,password);
        }
        else{
            System.out.println("Please enter valid username or password");
        }
    }

    //Checks input values taken from the user and activates requested method
    private void deleteAccount(String username, String password) throws NoSuchAlgorithmException {
        if (!Objects.equals(username, "") && !Objects.equals(username, "")){
            pm.deleteRecord(username,password);
        }
        else{
            System.out.println("Please enter valid username or password");
        }
    }

    //Activates requested method
    private void closeApplication(){
        System.exit(0);
    }

}
