package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;

public interface Searcheable<E> {
    void searchBy(BufferedReader bufferedReader) throws IOException;

}
