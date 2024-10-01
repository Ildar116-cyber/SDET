abstract class Car {
    private String color;
    protected static int max_Speed  ;
    protected int year_Of_release ;
    private double speed = 0;
    protected double mileage = 0.0;
    private boolean started_engine = false;

    Car(){}
    Car(int year_Of_release , double mileage , String color){
        this.year_Of_release = year_Of_release;
        this.mileage = mileage;
        this.color = color;
    }
    public void start_Engine(){
        started_engine = true;
        System.out.println(" Двигатель запущен");
    };

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void speed_up (double speed) {
        if (started_engine) {
            if (this.speed < max_Speed & this.speed + speed <= max_Speed) {
                this.speed += speed;
                System.out.println("Автомобиль ускорился на " + speed + " км/ч и теперь его скорость равна " + this.speed + " км/ч");
            } else
                System.out.println("Скорость превышает максимальную");
            System.out.println("Скорость скорость равна " + this.speed + " км/ч");
        }
        else System.out.println("Двигатель не запущен");
    }
    public void brake(double count){
        if (started_engine & speed >0 & speed - count >=0) {
            speed -= count;
            System.out.println("Автомобиль затормозил на " + count + " км/ч и теперь его скорость равна " + speed + " км/ч");
            if (speed == 0) {
                System.out.println("Автомобиль остановился");
            }
        }
    else if (started_engine & speed- count <= 0){speed = 0;
            System.out.println("Автомобиль остановился , скорость равна 0");}
    }
    public double getSpeed() {
        return speed;
    }




}
