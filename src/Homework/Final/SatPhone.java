package Homework.Final;

public class SatPhone extends Phone implements Internetable, Moveable{
    public SatPhone(String brandName, String modelName, String dateProduction) {
        super(brandName, modelName, dateProduction);
    }

    @Override
    public void call() {
        super.call();
    }

    @Override
    public String getBrandName() {
        return super.getBrandName();
    }

    @Override
    public void setBrandName(String brandName) {
        super.setBrandName(brandName);
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    @Override
    public String getDateProduction() {
        return super.getDateProduction();
    }

    @Override
    public void setDateProduction(String dateProduction) {
        super.setDateProduction(dateProduction);
    }

    @Override
    public void connect() {
        System.out.println("""
                1. Возможнось просмотра веб-страниц
                2. Возможность работы с электронной почтой
                3. Возможность приема и получения файлов
                """);
    }
    @Override
    public void move() {
        System.out.println("""
                Зона покрытия - поверхность практически всего земного шара
                """);
    }
}
