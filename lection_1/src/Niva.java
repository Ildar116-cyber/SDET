public class Niva extends PassengerCar implements GetInfoAboutCar , InsurancePrice  {
    final private String car_body = "Универсал" ;


    static final int power_engine = 80;
    Niva(){   max_Speed = 132;}
    Niva(int yearOfRelease , double mileage , String color){super();    max_Speed = 132;}
    Niva(int yearOfRelease , double mileage , String color ,String car_body , int car_weight){
    super(yearOfRelease, mileage , color, car_body , car_weight);
    max_Speed = 132;
    }


    @Override
    public void getInfoAboutCar() {
        System.out.println(" Автомобиль Нива " + year_Of_release + " года выпуска , с пробегом " + mileage + " км , цвет кузова - " + getColor()
                + " тип кузова - " + car_body);
    }



    public void insurancePrice() {
        int currentYear = java.time.Year.now().getValue();
        int carAge = currentYear - year_Of_release;


        int ageFactor = carAge * 100; // Чем старше автомобиль, тем дороже
        int mileageFactor =(int) (mileage * 0.1); // Увеличение страховки на 0.1 рубля за каждый км пробега
        int powerFactor = power_engine * 10; // Увеличение страховки на 10 рублей за каждую лошадиную силу
        System.out.print("Страховка будет стоить ");
        System.out.println( InsurancePrice.baseInsurance + baseInsurancePassengerCar + ageFactor + mileageFactor + powerFactor + " Рублей");

    }
    public boolean setDif_lock(boolean dif_lock) {
        if (dif_lock){
            System.out.println("Включена блокировка дифференциала");return true;}
        else {
            System.out.println("Блокировка дифференциала отключена ");return false;
        }
    }

}
// System.out.println(" Автомобиль Нива " + year_Of_release +" года выпуска , с пробегом " + mileage + "км , цвет кузова - "+ getColor());