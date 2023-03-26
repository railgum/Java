package Homework.Final;

public class Phone implements Callable {
    private String brandName;
    private String modelName;
    private String dateProduction;

    public Phone(String brandName, String modelName, String dateProduction) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.dateProduction = dateProduction;
    }
    @Override
    public void call(){
        System.out.println("Намираем ноберок!!!");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(String dateProduction) {
        this.dateProduction = dateProduction;
    }
}
