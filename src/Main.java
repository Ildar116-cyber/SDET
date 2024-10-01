public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Niva niva1= new Niva();
        niva1.year_Of_release = 1981;
        niva1.setColor("Белый");
        niva1.getInfoAboutCar();
        niva1.start_Engine();
        niva1.speed_up(100);
        niva1.brake(120);
        niva1.setDif_lock(true);
        niva1.insurancePrice();
        Niva niva2 = new Niva(2012 , 110000.0 , "Хаки" ," " ,985);
        niva2.getInfoAboutCar();
        Vesta vesta1 = new Vesta(2019 , 75000.0 , "Красный","Седан",1280,106);
        vesta1.getInfoAboutCar();
        Vesta vesta2 = new Vesta(2016 , 250400.0 , "Лаймовый","SW CROSS");
        vesta2.setEnginePower(145);
        vesta2.insurancePrice();
        vesta2.getInfoAboutCar();
        PassengerCar.func();

    }

}