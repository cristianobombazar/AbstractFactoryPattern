package net.unibave.designpattersnexample.builder.contact;

public class Director {

    public static ContactInternet builderContactInternet(String name, String email){
        return new ContactInternet(name, email);
    }

    public static ContactPhone builderContactPhone(String name, String phone){
        return new ContactPhone(name, phone);
    }

    public static ContactFull builderContactFull(String name, String address, String phone, String emal){
        return new ContactFull(name, address, phone, emal);
    }

}
