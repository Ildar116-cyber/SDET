public class Triangle <T extends Number> extends Figure implements Information {
    T A,B,C;
    public Triangle(T A,T B ,T C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    private double perimetr = 0;
    @Override
    double calculatePerimetr() {
        perimetr = A.doubleValue() + B.doubleValue() + C.doubleValue();
        return perimetr;
    }

    @Override
    double calculateArea() {
        calculatePerimetr();
        double poluperimetr = perimetr / 2;
        return Math.sqrt((poluperimetr)* (poluperimetr - A.doubleValue())* (poluperimetr - B.doubleValue())* (poluperimetr - C.doubleValue()));

    }


    @Override
    public String getInfo() {
        return "Стороны треугольника равны: " + A + ", " + B + ", " + C;
    }
}
