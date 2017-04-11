package inheritance;


import java.util.ArrayList;
import java.util.List;

public class Inheritance {
    public static void main(String[] args){

        Child c = new Child();

        Parent p = new Child();
        //runtime action=> method call
        List<String> a = new ArrayList<>();
        //same mean

        p.smoke();

        c.smoke();

    }
}