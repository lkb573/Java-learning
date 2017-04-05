
public class StringArrExam {
    public static void main(String[] args){

        String[] strArr = {
                "스시메이진", "용호낙지", "스시", "한옥집", "제면소",
                "두끼", "KFC", "미스사이공", "아비꼬", "구로곱창" };


        int sumSpell=0, count=0;
        double avgChar=0.0f;
        for (String e : strArr){
            sumSpell += e.length();
            count++;
        }
        avgChar = sumSpell / (double)count;


        System.out.printf("All count Char : %d \n", sumSpell);
        System.out.printf("Average Char : %.1f \n", avgChar);

        for (String i : strArr){
            if(i.length() <= 3)
                System.out.println(i);
        }

    }
}