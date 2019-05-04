package net.unibave.designpattersnexample.builder.contact;

public class Client {

    private String name;
    private String address;
    private String phone;
    private String email;


    public static Client.DirectorBuilder builder(){
        return new Client.DirectorBuilder();
    }

    public static class DirectorBuilder {

        private String name;
        private String address;
        private String phone;
        private String email;

        private DirectorBuilder() {
        }

        public Client.DirectorBuilder name(String name){
            this.name = name;
            return this;
        }

        public Client.DirectorBuilder address(String address){
            this.address = address;
            return this;
        }

        public Client.DirectorBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public Client.DirectorBuilder email(String email){
            this.email = email;
            return this;
        }

        public ContactInternet buildContactInternet(){
            return Director.builderContactInternet(this.name, this.email);
        }

        public ContactPhone buildContactPhone(){
            return Director.builderContactPhone(this.name, this.phone);
        }

        public ContactFull buildContactFull(){
            return Director.builderContactFull(this.name, this.address, this.phone, this.email);
        }


    }
}
