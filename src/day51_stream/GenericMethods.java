package day51_stream;

import java.util.List;

public class GenericMethods {
    public static <T> void printEach(T[] array) {
        for (T each : array) {
            System.out.println(each);
        }
    }

    public static <T> void printEach(List<T> list) {
        for (T each : list) {
            System.out.println(each);
        }
    }
}
