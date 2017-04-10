package oop;

public class ClassmemberExamTest {
    public static void main(String[] args){

        ClassmemberExamTest cme = new ClassmemberExamTest();

        int b = ClassmemberExam.getStaticTest();

        int a = ClassmemberExam.CLASS_MEMBER;

        System.out.println(a);
        System.out.println(b);

        int r = (int)(Math.random() * 6 + 1);
        System.out.println(r);

    }
}