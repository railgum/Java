package Homework.Final;

public class PresentScope<T> {
    private String possibility;
    public String getPossibility(){
        return possibility;
    }
    public void setPossibility(String possibility){
        this.possibility = possibility;
    }
    public void callMe(Callable callable){
        callable.call(this.possibility);
    }
    public void faxMade(Faxable faxable){
        faxable.workWithFax(this.possibility);
    }
    public void connectWeb(Internetable internetable){
        internetable.connect(this.possibility);
    }
    public void moveAway(Moveable moveable){
        moveable.move(this.possibility);
    }

}
