abstract class PassengerCar extends Car implements InsurancePrice  {

    static private int count = 0;
    static private double total_mileage = 0;
    public static final int baseInsurancePassengerCar = 5000;
    private String car_body;
    PassengerCar(){count++;
    }
    PassengerCar(int year_Of_release , double mileage ,  String color ){super(year_Of_release, mileage, color);count++;
        total_mileage += mileage;}
    PassengerCar(int year_Of_release , double mileage ,  String color , String car_body)
    {
        super(year_Of_release, mileage,color);
        count++;
        total_mileage += mileage;
        this.car_body = car_body;
    }
    PassengerCar(int year_Of_release , double mileage ,  String color , String car_body, int car_weight)
    {

        super(year_Of_release, mileage, color);
        count++;
        total_mileage += mileage;
        if (car_weight <=3500) {
            this.car_body = car_body;
        }
        else {
            System.out.println ("Ошибка: Автомобиль не является легковым, его масса превышает 3500 кг.Проверьте данные!");
        }
    }

    public void setCar_body(String car_body) {
        this.car_body = car_body;
    }
    public String getCar_body() {
        return car_body;
    }
    public static void func(){
        System.out.println("Всего машин: " +count);
        System.out.println("Их средний пробег: "+total_mileage/count);
    }

}

