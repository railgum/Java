package Homework.InfoScool;

public class Controller {
    private ViewInfo view;
    private Scool scool;

    public Controller(Scool scool, ViewInfo view) {
        this.view = view;
        this.scool = scool;
    }

    public ViewInfo getView() {
        return view;
    }

    public void setView(ViewInfo view) {
        this.view = view;
    }

    public Scool getScool() {
        return scool;
    }

    public void setScool(Scool scool) {
        this.scool = scool;
    }
    public void updateView(){
        view.printScoolDetails();
    }
}
