package Task_1;

public class Contact implements ContactInfo {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String info() {

        return "Name: " + name + ", Phone: " + phone;
    }
}
