package Planner;

public class JsonFile implements FileFormat{

    @Override
    public <T extends Note> String formatStringFile(T note) {
        return String.format(
                """
                        {
                        "id":%d,{
                        "note":"%s",
                        "author":"%s",
                        "date":"%s",
                        "deadline":"%s",
                        "priority":"%s"
                        }
                        }
                        """, note.getId(), note.getText(), note.getPerson(), note.getDateTimeAddNote(), note.getDeadLine(), note.getPriority());
    }
}
