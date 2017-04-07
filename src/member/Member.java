package member;


public class Member {

    private String Name;
    private int Age;
    private String phoneNum;
    private String eMail;

    public Member(){

    }

    public Member(String name, int age, String phoneNum, String eMail) {
        Name = name;
        Age = age;
        this.phoneNum = phoneNum;
        this.eMail = eMail;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
