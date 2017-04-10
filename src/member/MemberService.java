package member;


import java.util.List;

public class MemberService {

    public double calcAverAge(List<Member> list){
        int sum=0;
        for (Member e : list){
            sum += e.getAge();
        }
        double resultAver;
        return resultAver = (double) sum / list.size();
    }


    public int findMemberfirstname(List<Member> list, String checkchar){

        int count=0;
        for (Member e : list){
            if(e.getName().substring(0,1).equals(checkchar)) {
                count++;
            }
        }

        return count;
    }

    public double clacNamechar(List<Member> list){

        int check = 0;
        for (Member e : list){
            check += e.geteMail().length();
        }

        double emailAver;
        return emailAver = (double) check / list.size();
    }


    public String findSameage(List<Member> list, int checkAge){

        String resultPrint = "Same age Name :";

        for(Member e : list){
            if(e.getAge() == checkAge)
                resultPrint += (" "+e.getName());
        }



        return resultPrint;
    }

}