package part02;

import java.util.ArrayList;
import java.util.List;

/**
 * Your task is to implement the methods in this class. Use the JUnit test
 * provided to verify that your implementation works as expected. You can also
 * write a main method to test your implementations.
 *
 * Do not change the signatures of the methods already provided. However, you
 * are free to add new methods.
 */
public class CollectionsBasics {

    /**
     * Finds the maximum value in a list of integers. You can assume that the list
     * is not empty.
     *
     * @param numbers The list of integers.
     * @return The maximum value in the list.
     */
    public int maximum(List<Integer> numbers) {
        int max = numbers.get(0);

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }

        }

        return max; // DONE
    }

    /**
     * Calculates the sum of all integers in a list.
     *
     * @param numbers The list of integers.
     * @return The sum of all integers in the list.
     */
    public int sum(List<Integer> numbers) {
        int total = 0;

        for (int num : numbers) {
            total += num;
        }
        return total; // DONE

    }

    /**
     * Returns a new list, where the numbers from the given list are multiplied by
     * the given factor. The order of the numbers in the new list should be the same
     * as in the original list. For example, if the given list contains the
     * numbers -1, 0 and 100 and the factor is 2, the result is a new list
     * containing the numbers -2, 0 and 200.
     *
     * The original list should not be modified. Instead, a new list should be
     * created and returned.
     *
     * @param numbers A list of integers.
     * @return A new list, where the numbers are multiplied by the given factor.
     */
    public List<Integer> multiply(List<Integer> numbers, int factor) {
        List<Integer> uusiLista = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            uusiLista.add(numbers.get(i) * factor);

        }

        // List<Integer> multiplied = new ArrayList<>();

        return uusiLista; // DONE
    }

    /**
     * Generates and returns a list, which contains integer numbers between the
     * given start and end values. The start value is included in the list, but the
     * end value is not. The numbers must be in ascending order. If the end value is
     * less than or equal to the start value, an empty list is returned.
     *
     * @param start The start value, included in the list.
     * @param end   The end value, not included in the list.
     * @return A list containing the numbers between the start and end values.
     */
    public List<Integer> range(int start, int end) {
        List<Integer> uusiLista = new ArrayList<>();
        if (end <= start) {
            return uusiLista;
        } else {
            for (int i = start; i < end; i++) {
                uusiLista.add(i);
            }
            return uusiLista; // DONE
        }

    }

    /**
     * Concatenates (or joins) a list of strings into a single string.
     * For example, if the list contains the strings "foo", "bar" and "baz",
     * the result is "foobarbaz". You can assume that the list is not empty.
     *
     * @param strings The list of strings.
     * @return The concatenated string.
     */
    public String concatenateStrings(List<String> strings) {
        String jono = "";
        for (int i = 0; i < strings.size(); i++) {
            jono += strings.get(i);
            ;
        }
        return jono; // DONE
    }

    /**
     * Returns the lengths of the strings in the input list.
     * For example, if the input list contains the strings "Java", "Python" and
     * "TypeScript", the result is a list containing the numbers 4, 6 and 10.
     *
     * @param strings The list of strings.
     * @return A list containing the lengths of the strings in the input list.
     */
    public List<Integer> getLengths(List<String> strings) {
        List<Integer> pituudet = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            pituudet.add(strings.get(i).length());
        }

        return pituudet; // DONE
    }

    /**
     * Returns all the indices in the given text where the given substring is found
     * at. If the substring is not found in the text, an empty list is returned. The
     * search is case-sensitive and the indices are zero-based, just like in the
     * indexOf method of the String class.
     *
     * The substrings may overlap, in which case the method should return all the
     * indices where the substring starts. For example, if the text is "banana" and
     * the substring is "ana", the result is a list containing the numbers 1 and 3.
     *
     * @param text      The text to search from.
     * @param substring The substring to search for.
     * @return A list containing all the indices where the substring is found at.
     */
    public List<Integer> indicesOf(String text, String substring) {
        List<Integer> indeksit = new ArrayList<>();
        int index = text.indexOf(substring);
        for (int i = 0; i < text.length(); i++) {
            if (index != -1) {
                indeksit.add(index);
                index = text.indexOf(substring, index + 1);
            } else {
                break;
            }
        }

        // You can assume that the given substring is not empty.

        return indeksit; // DONE
    }
}
