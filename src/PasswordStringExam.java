import java.util.Scanner;

public class PasswordStringExam {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Input password : ");

        String preFix = "$$", postFix = "##";

        String checkStr = input.nextLine();
        /*int numChar = checkStr.length();
        String upChar = checkStr.substring(0,1).toUpperCase()
                        + checkStr.substring(1) ;

        if(numChar >= 8){
            postFix = "";
        }


        numChar *= numChar;

        String resultStr = preFix + upChar + numChar + postFix;*/

        //String resultStr = makePassword(checkStr, preFix, postFix);

        PasswordService service = new PasswordService();
        String resultStr = service.makePassword(checkStr,preFix,postFix);

        System.out.println(resultStr);

    }


    /*public static String makePassword(
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
    }*/
}
