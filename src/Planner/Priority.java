package Planner;

public enum Priority {
    low("низкая"),
    medium("средняя"),
    high("высокая"),
    immediate("дата увольнения");

    private String title;
    Priority(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        return "Приоритет: " + title;
    }
}

