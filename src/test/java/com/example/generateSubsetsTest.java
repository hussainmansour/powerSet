package test.java.com.example;

import main.java.com.example.generateSubsets;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class generateSubsetsTest {

    @Test
    void generateRecursively1() {

        generateSubsets subset = new generateSubsets();
        ArrayList<String> expected = subset.generateRecursively(new String[]{"1", "2"});

        for (int i = 0; i < expected.size(); i++) {
            String s = expected.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            expected.set(i, a);
        }

        ArrayList<String> actual = new ArrayList<>(Arrays.asList("1 ", "2 ", "2 1 ", ""));

        for (int i = 0; i < actual.size(); i++) {
            String s = actual.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            actual.set(i, a);
        }

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    void generateRecursively2() {

        generateSubsets subset = new generateSubsets();
        ArrayList<String> expected = subset.generateRecursively(new String[]{"amr", "hussien", "omar"});

        for (int i = 0; i < expected.size(); i++) {
            String s = expected.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            expected.set(i, a);
        }

        ArrayList<String> actual = new ArrayList<>(Arrays.asList("amr ", "hussien ", "omar ", "amr hussien ", "omar amr ", "omar hussien ", "amr hussien omar ", ""));

        for (int i = 0; i < actual.size(); i++) {
            String s = actual.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            actual.set(i, a);
        }

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    void generateRecursively3() {

        generateSubsets subset = new generateSubsets();
        ArrayList<String> expected = subset.generateRecursively(new String[]{"amr", "hussien", "10"});

        for (int i = 0; i < expected.size(); i++) {
            String s = expected.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            expected.set(i, a);
        }

        ArrayList<String> actual = new ArrayList<>(Arrays.asList("amr ", "hussien ", "10 ", "amr hussien ", "10 amr ", "10 hussien ", "amr hussien 10 ", ""));

        for (int i = 0; i < actual.size(); i++) {
            String s = actual.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            actual.set(i, a);
        }

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    void generateRecursively4() {

        generateSubsets subset = new generateSubsets();
        ArrayList<String> expected = subset.generateRecursively(new String[]{"1", "2", "3", "4", "5"});

        for (int i = 0; i < expected.size(); i++) {
            String s = expected.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            expected.set(i, a);
        }

        ArrayList<String> actual = new ArrayList<>(Arrays.asList(

                "", "1 ", "2 ", "3 ", "4 ", "5 ", "1 2 ", "1 3 ", "2 3 ", "1 4 ", "2 4 ", "3 4 ", "1 5 ", "2 5 ", "3 5 ", "4 5 ",
                "1 2 3 ", "1 2 4 ", "1 3 4 ", "2 3 4 ", "1 2 5 ", "1 3 5 ", "2 3 5 ", "1 4 5 ", "2 4 5 ", "3 4 5 ", "1 2 3 4 ",
                "1 2 3 5 ", "1 2 4 5 ", "1 3 4 5 ", "2 3 4 5 ", "1 2 3 4 5 "));

        for (int i = 0; i < actual.size(); i++) {
            String s = actual.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            actual.set(i, a);
        }

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    void generateIteratively1() {

        generateSubsets subset = new generateSubsets();
        ArrayList<String> expected = subset.generateIteratively(new String[]{"1", "2"});

        for (int i = 0; i < expected.size(); i++) {
            String s = expected.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            expected.set(i, a);
        }

        ArrayList<String> actual = new ArrayList<>(Arrays.asList("1 ", "2 ", "2 1 ", ""));

        for (int i = 0; i < actual.size(); i++) {
            String s = actual.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            actual.set(i, a);
        }

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));

    }

    @Test
    void generateIteratively2() {

        generateSubsets subset = new generateSubsets();
        ArrayList<String> expected = subset.generateIteratively(new String[]{"amr", "hussien", "omar"});

        for (int i = 0; i < expected.size(); i++) {
            String s = expected.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            expected.set(i, a);
        }

        ArrayList<String> actual = new ArrayList<>(Arrays.asList("amr ", "hussien ", "omar ", "amr hussien ", "omar amr ", "omar hussien ", "amr hussien omar ", ""));

        for (int i = 0; i < actual.size(); i++) {
            String s = actual.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            actual.set(i, a);
        }

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));

    }

    @Test
    void generateIteratively3() {

        generateSubsets subset = new generateSubsets();
        ArrayList<String> expected = subset.generateIteratively(new String[]{"amr", "hussien", "10"});

        for (int i = 0; i < expected.size(); i++) {
            String s = expected.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            expected.set(i, a);
        }

        ArrayList<String> actual = new ArrayList<>(Arrays.asList("amr ", "hussien ", "10 ", "amr hussien ", "10 amr ", "10 hussien ", "amr hussien 10 ", ""));

        for (int i = 0; i < actual.size(); i++) {
            String s = actual.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            actual.set(i, a);
        }

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    void generateIteratively4() {

        generateSubsets subset = new generateSubsets();
        ArrayList<String> expected = subset.generateIteratively(new String[]{"1", "2", "3", "4", "5"});

        for (int i = 0; i < expected.size(); i++) {
            String s = expected.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            expected.set(i, a);
        }

        ArrayList<String> actual = new ArrayList<>(Arrays.asList(

                "", "1 ", "2 ", "3 ", "4 ", "5 ", "1 2 ", "1 3 ", "2 3 ", "1 4 ", "2 4 ", "3 4 ", "1 5 ", "2 5 ", "3 5 ", "4 5 ",
                "1 2 3 ", "1 2 4 ", "1 3 4 ", "2 3 4 ", "1 2 5 ", "1 3 5 ", "2 3 5 ", "1 4 5 ", "2 4 5 ", "3 4 5 ", "1 2 3 4 ",
                "1 2 3 5 ", "1 2 4 5 ", "1 3 4 5 ", "2 3 4 5 ", "1 2 3 4 5 "));

        for (int i = 0; i < actual.size(); i++) {
            String s = actual.get(i);
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            actual.set(i, a);
        }

        assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
    }
}
