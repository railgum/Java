package Homework.Final;

public class SatPhone extends Phone implements Internetable, Moveable{
    public SatPhone(String brandName, String modelName, String dateProduction) {
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
    public String toString(){
        return "Марка телефона: " + getBrandName() +
                "\n Модель: " + getModelName() +
                "\n Дата производства: " + getDateProduction();
    }
    @Override
    public void call(String abonent) {
        System.out.println("Вам звонит " + abonent);
    }
}
