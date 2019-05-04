package net.unibave.designpattersnexample.builder.contact;

public class ContactFull {

    private String name;
    private String address;
    private String phone;
    private String email;

    public ContactFull(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactFull{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
