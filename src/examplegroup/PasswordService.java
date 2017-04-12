package examplegroup;

public class PasswordService {
    public String makePassword(
            String origin, String pre, String post){

        int numChar = origin.length();
        String upChar = origin.substring(0,1).toUpperCase()
                + origin.substring(1) ;

        if(numChar >= 8){
            post = "";
        }

        numChar *= numChar;

        String resultStr = pre + upChar + numChar + post;

        return resultStr;
    }
}
