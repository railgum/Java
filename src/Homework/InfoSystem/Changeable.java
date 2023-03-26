package Homework.InfoSystem;

import java.io.BufferedReader;
import java.io.IOException;

public interface Changeable<E> {
    void changeBy(BufferedReader bufferedReader) throws IOException;
}
