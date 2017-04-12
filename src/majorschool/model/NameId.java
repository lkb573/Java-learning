package majorschool.model;


public class NameId {
    private String nameId;

    public NameId() {

    }

    @Override
    public String toString() {
        return "NameId( nameId = " + nameId + ")" + '\n';
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public NameId(String nameId) {

        this.nameId = nameId;
    }
}
