package rensyu.nyuryoku.mondai13.M_c;

class PersonPrinter {
    public static void main(String[] args) {
        // Personを二つaに持ってくる
        Person[] a = new Person[2];
        // 別のファイルのものをそれぞれaのリストに入れる
        a[0] = new Teacher();
        a[1] = new Cook();

        // リストの数だけ繰り返す
        for (Person p : a) {
            p.introduce();
            System.out.println();
        }
    }
}
