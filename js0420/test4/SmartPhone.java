package js0420.test4;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String od) {
        this.company = company;
        this.os = os;
    }
    @Override
    public String toString() {
        return company + ", " + os;
    }
}
