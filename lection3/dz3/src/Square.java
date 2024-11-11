

public class Square<T extends Number> extends Figure implements Information{

T A;
public Square(T A){
    this.A = A;
    }
    @Override
    double calculateArea() {
       return A.doubleValue()*A.doubleValue();
    }

    @Override
    double calculatePerimetr() {
        return A.doubleValue()*4;
    }

    @Override
    public T getInfo() {
        System.out.print("Стороны квадрата равны :" );
        return A;
    }
}
