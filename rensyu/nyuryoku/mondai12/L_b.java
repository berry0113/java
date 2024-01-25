package rensyu.nyuryoku.mondai12;
import java.util.Scanner;
class Person {
    String name, job;
    Person(String name, String job)
    {this.name = name; this.job = job;}
    void constuct(String name, String job){
        System.out.println("氏名："+ name);
        System.out.println("職業："+ job);
    }
}

class Teacher extends Person {
    String subject;
    Teacher(String name, String job, String subject) {super(name, job); this.subject = subject;}
    
}


class L_b {
    Scanner stdIn = new Scanner(System.in);
}
