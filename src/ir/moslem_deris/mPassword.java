package ir.moslem_deris;

import java.util.Random;

/**
 * Created by MosleM on 8/21/2015.               Email: Moslem.Deris@Outlook.Com
 */
public class mPassword {

    //  Variables
    private String password;

    //  Constructor
    public mPassword(){
        setRandomPassword();
    }

    //  Public I/O methods
    public void setPassword(String newPassword){
        password=newPassword;
    }
    public void setRandomPassword(){
        String newPassword="";
        StringBuilder reference = new StringBuilder("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~!@#$%^&*()_-+={}[]\\|:;\"'<>,.?/");
        for (int i=1;i<=12;i++){
            Random random = new Random();
            int charPosition = random.nextInt(reference.length());
            newPassword+=reference.charAt(charPosition);
            reference.deleteCharAt(charPosition);
            password=newPassword;
        }
    }
    public int getRatePercent(){
        int rate=0;
        if (hasAtLeastOneLetter(password))
            rate+=1;
        if (hasAtLeastOneNumber(password))
            rate+=1;
        if (hasAtLeastOneSymbol(password))
            rate+=1;
        if (isLengthAtLeastEight(password))
            rate+=1;
        if (isLengthAtLeastTwelve(password))
            rate+=1;
        if (hasNoRepeatedCharacters(password))
            rate+=1;
        if (hasBothUpperCaseAndLowerCaseLetters(password))
            rate+=1;
        return (rate*100)/7;
    }
    public String getPassword(){
        return password;
    }

    //  static methods
    private static boolean hasAtLeastOneLetter(String password){
        for (int i=0;i<password.length();i++){
            if (isUpperLetter(password.charAt(i))){
                return true;
            }
            if (isLowerLetter(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
    private static boolean hasAtLeastOneNumber(String password){
        for (int i=0;i<password.length();i++){
            if (isNumber(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
    private static boolean hasAtLeastOneSymbol(String password){
        for (int i=0;i<password.length(); i++) {
            if (!isNumber(password.charAt(i)) && !isUpperLetter(password.charAt(i)) && !isLowerLetter(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
    private static boolean isLengthAtLeastEight(String password){
        return password.length() >= 8;
    }
    private static boolean isLengthAtLeastTwelve(String password){
        return password.length() >= 12;
    }
    private static boolean hasNoRepeatedCharacters(String password){
        for (int i=0;i<password.length();i++){
            if (password.substring(i+1,password.length()).contains(Character.toString(password.charAt(i)))){
                return false;
            }
        }
        return true;
    }
    private static boolean hasBothUpperCaseAndLowerCaseLetters(String password){
        boolean hasUpperLetter = false;
        boolean hasLowerLetter = false;
        for (int i=0;i<password.length();i++){
            if (isUpperLetter(password.charAt(i)))
                hasUpperLetter = true;
            if (isLowerLetter(password.charAt(i)))
                hasLowerLetter=true;
        }
        return hasLowerLetter && hasUpperLetter;
    }
    private static boolean isNumber(char ch){
        for (char c='0';c<='9';c++){
            if (c==ch){
                return true;
            }
        }
        return  false;
    }
    private static boolean isUpperLetter(char ch){
        for (char c='A';c<='Z';c++){
            if (c==ch){
                return true;
            }
        }
        return  false;
    }
    private static boolean isLowerLetter(char ch){
        for (char c='a';c<='z';c++){
            if (c==ch){
                return true;
            }
        }
        return  false;
    }
    private static char getRandomNumber(){
        String reference = "0123456789";
        Random random = new Random();
        return reference.charAt(random.nextInt(reference.length()));
    }
    private static char getRandomUpperCaseLetter(){
        String reference = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        return reference.charAt(random.nextInt(reference.length()));
    }
    private static char getRandomLowerCaseLetter(){
        String reference = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        return reference.charAt(random.nextInt(reference.length()));
    }
    private static char getRandomCharacter(){
        String reference = " ~!@#$%^&*()_-+={}[]\\|:;\"'<>,.?/";
        Random random = new Random();
        return reference.charAt(random.nextInt(reference.length()));
    }
    private static char getRandomChar(){
        String reference = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~!@#$%^&*()_-+={}[]\\|:;\"'<>,.?/";
        Random random = new Random();
        return reference.charAt(random.nextInt(reference.length()));
    }

} // class Password