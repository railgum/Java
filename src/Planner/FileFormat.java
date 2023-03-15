package Planner;

public interface FileFormat {
    <T extends Note> String formatStringFile(T note);
}
