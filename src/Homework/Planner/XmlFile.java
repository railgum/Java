package Homework.Planner;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlFile{
    public String formatStringFile(Note note) {
        Document document = stringToDocument(String.format("""
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
                        """, note.getId(), note.getText(), note.getPerson(), note.getDateTimeAddNote(), note.getDeadLine(), note.getPriority()));
        return documentToString(document);
    }
    // конвертируем XML Document в строку
    private static String documentToString(Document document) {
        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer transfObject;
        try {
            transfObject = tFactory.newTransformer();
            transfObject.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            StringWriter writer = new StringWriter();
            transfObject.transform(new DOMSource(document), new StreamResult(writer));

            return writer.getBuffer().toString();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return null;
    }
    private static Document stringToDocument(String xmlStr) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        try {
            docBuilder = builderFactory.newDocumentBuilder();
            return docBuilder.parse(new InputSource(new StringReader(xmlStr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
