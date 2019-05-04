package net.unibave.designpattersnexample.builder.contact;

public class ContactInternet {

    private String name;
    private String email;

    public ContactInternet(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInternet{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
