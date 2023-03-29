package Homework.Final;

public class FixedPhone extends Phone implements Faxable{
    public FixedPhone(String brandName, String modelName, String dateProduction) {
        super(brandName, modelName, dateProduction);
    }
    @Override
    public void workWithFax(String document){
        System.out.println(document +  " принят/отправлен");
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
