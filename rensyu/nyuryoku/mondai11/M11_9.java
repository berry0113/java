package rensyu.nyuryoku.mondai11;

public class M11_9 {
    public static void main(String[] args) {
        Person a = new Person("A", 18, "千代田区", "aaa@gmail.com");
        Person b = new Person("B", -3, "千代田区", "aaa@gmail.com");
        System.out.println(a.name);
        System.out.println(a.getaddress());
    }
}
