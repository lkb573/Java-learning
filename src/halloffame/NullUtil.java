package halloffame;


public class NullUtil {

    public static int parseInt(String s){

        return  (s.equals(""))
                ? 0
                : Integer.parseInt(s);

    }

}
