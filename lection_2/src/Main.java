public class Main {
    public static void main(String[] args) {
        Authorization akk1 = new Authorization();
        akk1.login = "ildar!123";
        akk1.password = "cisco";
        akk1.confirmPassword="cisco1";
        Authorization akk2 = new Authorization();
        akk2.login = "ildar116";
        akk2.password = "PRO";
        akk2.confirmPassword="PRO";
        Authorization akk3 = new Authorization();
        akk3.login = "ildar116123";
        akk3.password = "ASD";
        akk3.confirmPassword="PR0";
        Authorization.processAuthorization(akk1.login, akk1.password, akk1.confirmPassword);
        Authorization.processAuthorization(akk2.login, akk2.password, akk2.confirmPassword);
        Authorization.processAuthorization(akk3.login, akk3.password, akk3.confirmPassword);

    }
}