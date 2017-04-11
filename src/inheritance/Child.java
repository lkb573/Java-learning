package inheritance;


public class Child extends Parent{
    private String hobby;

    @Override
    public void smoke(){
        System.out.println("Son is smoking");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
