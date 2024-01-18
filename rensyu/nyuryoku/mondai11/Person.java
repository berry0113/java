package rensyu.nyuryoku.mondai11;

public class Person {
    
    public String name;
    int age;
    private String address;
    String email;

    Person(String name, int age, String address, String email){
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public boolean checkAge(int age){
        if(0 <= age && age< 100){
            return true;
        }
        return false;
    }
    public String getaddress(){
        return address;
    }

}
