package rensyu.nyuryoku;

class G_b {
    public static void main(String[] args) {
        int x,y;
        x = 0;
        y = 1;
        
        while (y <=100 ){
            x += y;
            y++;
        }
        do {
            System.out.print("合計："+x);
        } while (y <= 100);
    }
}
