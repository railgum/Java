package Homework.Final;

public class FixedPhone extends Phone{
    public FixedPhone(String brandName, String modelName, String dateProduction) {
        super(brandName, modelName, dateProduction);
    }

    @Override
    public void call() {
        super.call();
    }


}
