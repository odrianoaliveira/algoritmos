package math;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Point {
    private int x;
    private int y;

    public Point(int xc, int yc) {
        this.x = xc;
        this.y = yc;
    }

    public static double distance(int xa, int ya, int xb, int yb) {
        double horizontalDistance = Math.pow((xa - xb), 2);
        double verticalDistance = Math.pow((ya - yb), 2);

        double distance = Math.sqrt(horizontalDistance+verticalDistance);
        return distance;
    }

    public static Point simetria(int xa, int ya, int xb, int yb) {
        int xc = 2 * xb - xa;
        int yc = 2 * yb - ya;
        return Point.builder().x(xc).y(yc).build();
    }

    @Override
    public String toString() {
        return "Point{" + x + ", " + y + '}';
    }
}
