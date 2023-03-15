package Planner;

public class XmlFile implements FileFormat{
    @Override
    public <T extends Note> String formatStringFile(T note) {
        return String.format(
                """
                        <xml>
                        <Note>
                        <id>%d</id>
                        <Note>%s</Note>
                        <Author>%s</Author>
                        <Date>%s</Date>
                        <Deadline>%s</Deadline>
                        <Priority>%s</Priority>
                        </Note>
                        </xml>
                """, note.getId(), note.getText(), note.getPerson(), note.getDateTimeAddNote(), note.getDeadLine(), note.getPriority());
    }
}
