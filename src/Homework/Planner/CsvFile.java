package Homework.Planner;

public class CsvFile implements FileFormat{
    @Override
    public String formatStringFile(Note note) {
        return String.format("%d | %s | %s | %s | %s | %s\n",
                note.getId(),note.getText(),note.getPerson(),
                note.getDateTimeAddNote(),note.getDeadLine(),
                note.getPriority());
    }

}
