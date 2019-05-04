package net.unibave.designpattersnexample.builder.contact;

public class ContactPhone {

    private String name;
    private String phone;

    public ContactPhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ContactPhone{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
