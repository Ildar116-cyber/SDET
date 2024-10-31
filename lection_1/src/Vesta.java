public class Vesta extends PassengerCar implements GetInfoAboutCar, InsurancePrice {

    // Статический массив мощностей двигателя
    static final int[] power_engine = {90 , 106, 122, 145};
    static final int[] max_speeds = {170 , 182, 179, 193};



    // Поле для мощности двигателя конкретной машины
    private int enginePower;

    // Конструктор
    Vesta(){ max_Speed = 0;}
    Vesta(int year_Of_release , double mileage ,  String color , String car_body){
        super(year_Of_release, mileage,color,car_body);
        max_Speed = 0;
    }
    Vesta(int year_Of_release, double mileage, String color, String car_body, int car_weight, int enginePower) {
        super(year_Of_release, mileage, color, car_body, car_weight);


        // Проверяем, что переданная мощность соответствует значениям в массиве
        boolean validPower = false;
        for (int power : power_engine) {
            if (power == enginePower) {
                this.enginePower = enginePower;
                validPower  = true;
                break;
            }
        }

        // Если мощность некорректна, выбрасываем исключение
        if (!validPower) {
            throw new IllegalArgumentException("Некорректная мощность двигателя. Должно быть одно из значений:90, 106, 122 или 145.");
        }
        for (int i = 0; i<=3 ; i++){
            if (power_engine[i] == this.enginePower){
                max_Speed = max_speeds[i];
            }

        }

    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
        boolean validPower = false;
        for (int power : power_engine) {
            if (power == enginePower) {
                this.enginePower = enginePower;
                validPower  = true;
                break;
            }
        }

        // Если мощность некорректна, выбрасываем исключение
        if (!validPower) {
            throw new IllegalArgumentException("Некорректная мощность двигателя. Должно быть одно из значений:90, 106, 122 или 145.");
        }
        for (int i = 0; i<=3 ; i++){
            if (power_engine[i] == this.enginePower){
                max_Speed = max_speeds[i];
            }

        }
    }

    @Override
    public void getInfoAboutCar() {
        System.out.println("Автомобиль Веста " + year_Of_release + " года выпуска, с пробегом " + mileage + " км, цвет кузова - " + getColor()
                + ", тип кузова - " + getCar_body() + ", мощность двигателя - " + enginePower + " л.с. " +"максимальная скорость - "+ max_Speed);
    }




    public void insurancePrice() {
        int currentYear = java.time.Year.now().getValue();
        int carAge = currentYear - year_Of_release;

        // Формула для расчета страховки

        int ageFactor = carAge * 100; // Чем старше автомобиль, тем дороже
        int mileageFactor =(int) (mileage * 0.1); // Увеличение страховки на 0.1 рубля за каждый км пробега
        int powerFactor = enginePower * 10; // Увеличение страховки на 10 рублей за каждую лошадиную силу
        if (enginePower>=100) powerFactor += 1500;
        System.out.print("Страховка будет стоить ");
        System.out.println(InsurancePrice.baseInsurance + baseInsurancePassengerCar + ageFactor + mileageFactor + powerFactor + " Рублей");
    }
}


