import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Hashtable;

public class PasswordDAO {

    /*
    This project is not the best practise for user credential management but main reason to code
    project was to practise hash table data structure and hashing
    */
    private final Hashtable<String, String> mockDatabase = new Hashtable<>();

    //Adds record to the hard coded database
    public void addRecord(String username, String password) throws NoSuchAlgorithmException {
        if(isRecordExist(username)){
            System.out.println("Username is existed, choose another username!");
        }
        else {
            mockDatabase.put(usernameHashing(username), passwordHashing(password));
            System.out.println("Congrats, your account has been created.");
        }
    }

    //Removes record from the hard coded database
    public void deleteRecord(String username, String password) throws NoSuchAlgorithmException {
        if(isRecordExist(username)){
            if ((mockDatabase.get(usernameHashing(username))).equals(passwordHashing(password))){
                mockDatabase.remove(usernameHashing(username));
                System.out.println("Your account has been deleted");
            }
            else{
                System.out.println("Please enter valid username or password");
            }
        }
        else {
            System.out.println("Please enter valid username or password");
        }
    }

    //Login methods, method that checks credentials from the hard coded database
    public void accessRecord(String username, String password) throws NoSuchAlgorithmException {
        if(isRecordExist(username)){
            if (mockDatabase.get(usernameHashing(username)).equals(passwordHashing(password))){
                System.out.println("Welcome to our web site "+ username);
            }
            else{
                System.out.println("Please enter valid username or password");
            }
        }
        else {
            System.out.println("Please enter valid username or password");
        }
    }

    //Method that checks if username is already in use
    private boolean isRecordExist(String username) throws NoSuchAlgorithmException {
        return mockDatabase.containsKey(usernameHashing(username));
    }

    //Username hashing by sha256
    private String usernameHashing(String username) throws NoSuchAlgorithmException {

        byte[] hashedByteList =  sha256Hashing(username);

        return toHexString(hashedByteList);
    }

    //Password hashing by md5 hashing
    private String passwordHashing(String password) throws NoSuchAlgorithmException {

        byte [] Md5 = md5Hashing(password);

        return toHexString(Md5);
    }

    //Sha hashing method
    private byte [] sha256Hashing(String shaString) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance( "SHA-256" ) ;

        return md.digest(shaString.getBytes( StandardCharsets.UTF_8 ) );
    }

    //Md5 hashing method
    private byte [] md5Hashing(String mdString) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance( "MD5" ) ;

        return md.digest(mdString.getBytes( StandardCharsets.UTF_8 ) );
    }

    private String toHexString(byte[] hash){

        // For converting byte array into signum representation
        BigInteger number = new BigInteger( 1, hash ) ;
        // For converting message digest into hex value
        StringBuilder hexString = new StringBuilder( number.toString( 16 ) ) ;

        // Pad with leading zeros
        while ( hexString.length( ) < 32 )
        {
            hexString.insert( 0,  " 0 " ) ;
        }
        return hexString.toString( ) ;
    }
}
