package majorschool.model;


public class School {
    private String schoolId;
    private String name;
    private String city;
    private String state;
    private String country;

    @Override
    public String toString() {
        return "School(" +
                "schoolId='" + schoolId + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ')' + '\n';
    }

    public School() {
    }

    public School(String schoolId, String name, String city, String state, String country) {
        this.schoolId = schoolId;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
