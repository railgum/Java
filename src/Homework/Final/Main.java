package Homework.Final;

public class Main {
    public static void main(String[] args) {
        Phone fixed1 = new FixedPhone("BBK", "BKT-74", "23-04-2021");
        Phone smart1 = new SmartPhone("Honor", "View 10", "14-09-2020");
        Phone sat1 = new SatPhone("Thuraya", "XT-LITE", "07-12-2019");

        PresentScope presentScope = new PresentScope();
        presentScope.setPossibility("Отчет");
        presentScope.faxMade((Faxable) fixed1);

        presentScope.setPossibility("GB");
        presentScope.connectWeb((Internetable) smart1);
        presentScope.setPossibility("Зона охвата оператора");
        presentScope.moveAway((Moveable) smart1);
        presentScope.setPossibility("Весь земной шарик");
        presentScope.moveAway((Moveable) sat1);
        presentScope.setPossibility("Сагун");
        presentScope.callMe((Callable) smart1);
    }
}
