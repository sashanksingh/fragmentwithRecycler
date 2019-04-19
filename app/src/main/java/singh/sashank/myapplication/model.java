package singh.sashank.myapplication;

public class model {
    private String name;
    private String faculty;
    private String number;
    private String address;

    public model(String name, String faculty, String number, String address) {
        this.name = name;
        this.faculty = faculty;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }
}
