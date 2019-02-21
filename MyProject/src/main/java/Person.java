public class Person {
    private String name;
    private String sname;
    private String address;

    public Person(String name, String sname, String address) {
        this.name = name;
        this.sname = sname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name: " + name + ",surname: " + sname + ", address: " + address;
    }
}
