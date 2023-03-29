package Homework.Final;

public class SmartPhone extends Phone implements Internetable, Moveable{
    public SmartPhone(String brandName, String modelName, String dateProduction) {
        super(brandName, modelName, dateProduction);
    }

    @Override
    public void connect(String webPage) {
        System.out.println("Сайт " + webPage + " успешно открыт");
    }
    @Override
    public void move(String place) {
        System.out.println("Зона покрытия - " + place);
    }

    @Override
    public void call(String abonent) {
        System.out.println("Вам звонит " + abonent);
    }
}
