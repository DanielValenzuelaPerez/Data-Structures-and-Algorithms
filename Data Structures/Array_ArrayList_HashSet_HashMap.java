import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Array_ArrayList_HashSet_HashMap {
    public static void main(String[] args) {
        regularArrayExample();
        arrayListExample();
    }

    public static void regularArrayExample() {
        int array_size = 5;
        String[] names = new String[array_size];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array_size; i++) {
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < array_size; i++) {
            System.out.println(names[i]);
        }
    }

    public static void arrayListExample() {
        int array_size;
        ArrayList<String> names = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        array_size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array_size; i++) {
            System.out.print("Name: ");
            names.add(scanner.nextLine());
        }
        for (int i = 0; i < array_size; i++) {
            System.out.println(names.get(i));
        }

        if (hashSetExample(names)) {
            System.out.println("Unique names");
        } else {
            System.out.println("Repeating names");
        }

        hashMapExample(names);
    }

    public static boolean hashSetExample(ArrayList<String> names) {
        HashSet<String> unique_names = new HashSet<>();

        for (String name : names) {
            if (unique_names.contains(name)) {
                return false;
            }
            unique_names.add(name);
        }
        return false;
    }

    public static void hashMapExample(ArrayList<String> names) {
        HashMap<String, Integer> repeating_names = new HashMap<>();

        for (String name : names) {
            repeating_names.put(name, repeating_names.getOrDefault(name, 0) + 1);
        }
        for (String i : repeating_names.keySet()) {
            System.out.println("key: " + i + " value: " + repeating_names.get(i));
        }
    }
}
