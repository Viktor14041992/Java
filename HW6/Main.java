package HW6;

// import java.util.HashSet;
// import java.util.Scanner;
// import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Laptop> set = new HashSet<>();
        set.add(new Laptop("Laptop 1", 64, "linux", 110000, "Lenovo"));
        set.add(new Laptop("Laptop 2", 8, "Windows10", 75000, "HP"));
        set.add(new Laptop("Laptop 3", 32, "linux", 95000, "Lenovo"));
        set.add(new Laptop("Laptop 4", 16, "Windows10", 90000, "Asus"));

        LaptopsOperation operation = new LaptopsOperation(set);
        operation.start();

    }
}
