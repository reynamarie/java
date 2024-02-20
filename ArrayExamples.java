import tester.*;

class Pair {
    int a;
    int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class ArrayExamples {
    // Methods
    public static String reverseJoinWith(String[] array, String separator) {
        if (array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i != 0) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

    public static boolean logicalOr(boolean[] array) {
        for (boolean value : array) {
            if (value) {
                return true;
            }
        }
        return false;
    }

    public static boolean allOutsideRange(double[] array, double low, double high) {
        for (double value : array) {
            if (value >= low && value <= high) {
                return false;
            }
        }
        return true;
    }

    public static Pair addMulti(int[] array) {
        int sum = 0;
        int product = 1;
        for (int value : array) {
            sum += value;
            product *= value;
        }
        return new Pair(sum, product);
    }

    public static String lastSortedString(String[] array) {
        String last = array[0];
        for (String value : array) {
            if (value.compareTo(last) > 0) {
                last = value;
            }
        }
        return last;
    }

    public static int lookup(String[] keys, int[] values, String key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                return values[i];
            }
        }
        return -1;
    }

    // Test methods
    public boolean testReverseJoinWith(Tester t) {
        t.checkExpect(reverseJoinWith(new String[]{"a", "b", "c"}, ":"), "c:b:a");
        t.checkExpect(reverseJoinWith(new String[]{}, ":"), "");
        t.checkExpect(reverseJoinWith(new String[]{"a"}, ":"), "a");
        return true; // Indicate that the test ran successfully
    }

    public boolean testLogicalOr(Tester t) {
        t.checkExpect(logicalOr(new boolean[]{true, false, false}), true);
        t.checkExpect(logicalOr(new boolean[]{false, false, false}), false);
        t.checkExpect(logicalOr(new boolean[]{}), false);
        return true; // Indicate that the test ran successfully
    }

    public boolean testAllOutsideRange(Tester t) {
        t.checkExpect(allOutsideRange(new double[]{1.0, 2.0, 3.0}, 0.0, 4.0), false);
        t.checkExpect(allOutsideRange(new double[]{5.0, 6.0, 7.0}, 0.0, 4.0), true);
        t.checkExpect(allOutsideRange(new double[]{}, 0.0, 4.0), true);
        return true; // Indicate that the test ran successfully
    }

    public boolean testAddMulti(Tester t) {
        Pair result1 = addMulti(new int[]{1, 2, 3, 4, 5});
        Pair result2 = addMulti(new int[]{6, 7, 8, 9, 10});
        t.checkExpect(result1.a, 15);
        t.checkExpect(result1.b, 120);
        t.checkExpect(result2.a, 40);
        t.checkExpect(result2.b, 30240);
        return true; // Indicate that the test ran successfully
    }

    public boolean testLastSortedString(Tester t) {
        t.checkExpect(lastSortedString(new String[]{"bye", "hello", "goodbye"}), "hello");
        t.checkExpect(lastSortedString(new String[]{"apple", "banana", "cherry"}), "cherry");
        t.checkExpect(lastSortedString(new String[]{"zoo", "animal", "elephant"}), "zoo");
        return true; // Indicate that the test ran successfully
    }

    public boolean testLookup(Tester t) {
        String[] keys = {"UCSD", "UCLA", "UCI"};
        int[] values = {36000, 44900, 33467};
        t.checkExpect(lookup(keys, values, "UCI"), 33467);
        t.checkExpect(lookup(keys, values, "Stanford"), -1);
        t.checkExpect(lookup(keys, values, "UCSD"), 36000);
        return true; // Indicate that the test ran successfully
    }

    public static void main(String[] args){
        Tester.runReport(new ArrayExamples(), false, false);
    }
}


