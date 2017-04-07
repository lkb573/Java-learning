package member;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MemberList {
    public static void main(String[] args){

        Member memberLkb = new Member(
                "이기봉",26,
                "010-3009-5732","lkb573@gmail.com");
        Member memberHeo = new Member(
                "허민",30,
                "010-2675-0601","heo@gmail.com");
        Member memberHwang = new Member(
                "황순성",27,
                "010-5052-9103","hwang@gmail.com");
        Member memberJin = new Member(
                "진하영",24,
                "010-3033-3247","vnfflvdl1@gmail.com");
        Member memberLjs = new Member(
                "이진석",26,
                "010-2979-0767","jins920409@gmail.com");
        Member memberRge = new Member(
                "류관이",25,
                "010-2478-1378","sona.ria.sss@gmail.com");
        Member memberLkw = new Member(
                "이가원",25,
                "010-6439-5943","dlrkdnjs1211@gmail.com");
        Member memberKtj = new Member(
                "김태준",27,
                "010-6256-7334","kim19911211@gmail.com");
        Member memberKsw = new Member(
                "김세원",27,
                "010-4734-6378","sewon0613@naver.com");
        Member memberRsa = new Member(
                "류승아",25,
                "010-9377-6928","loveyou_06@naver.com");
        Member memberIm = new Member(
                "임준성",20,
                "010-9972-8210","wnstjd9972@gmail.com");


        List<Member> list = Arrays.asList(
                memberHeo,memberHwang,memberIm,memberJin,memberKsw,
                memberKtj,memberLjs,memberLkb,memberLkw,
                memberRge,memberRsa);


        MemberService service = new MemberService();
        double averAge = service.calcAverAge(list);


        System.out.printf("Class Average Age : %.1f\n", averAge);


        System.out.print("What find Frist name? : ");
        Scanner scan = new Scanner(System.in);
        String fristName = scan.next();

        MemberService service1 = new MemberService();
        int checkFstname = service1.findMemberfirstname(list, fristName);

        System.out.printf("That's frist name people : %d\n", checkFstname);


        MemberService service2 = new MemberService();
        double averNamechar = service2.clacNamechar(list);

        System.out.printf("Class Email Char Average Age : %.1f\n", averNamechar);


        System.out.print("Check age? : ");
        int checkAge = scan.nextInt();

        MemberService service3 = new MemberService();
        String sameAgename = service3.findSameage(list, checkAge);
        System.out.println(sameAgename);

    }
}
