class Point2D {
    // 座標
    int x;
    int y;

    Point2D(int x, int y) { this.x = x; this.y = y;}
    // 座標の設定
    void setX(int x) { this.x = x; }
    void setY(int y) { this.y = y; }
    // 座標の取得
    int getX() { return x; }
    int getY() { return y; }
}

class Point3D extends Point2D {
    int z;
    Point3D(int x, int y, int z) { super(x, y); this.z = z; }
    // z座標の設定
    void setZ(int z) { this.z = z; }
    // z座標を取得
    int getZ() { return z; }
}

public class PointTester {
    public static void main(String[] args) {
        //それぞれの座標を代入させて変数に入れる 
        Point2D a = new Point2D(10, 15);
        Point3D b = new Point3D(20, 30, 40);
        // 表示
        System.out.printf("a = (%d, %d)\n", a.getX(), a.getY());
        System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
    }
}