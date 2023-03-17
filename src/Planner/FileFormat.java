package Planner;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

public interface FileFormat {
    <T extends Note> String formatStringFile(T note) throws SAXException, ParserConfigurationException;
}
