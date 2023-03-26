package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;

public interface Deleteable<E> {
    void deleteBy(BufferedReader bufferedReader) throws IOException;
}
