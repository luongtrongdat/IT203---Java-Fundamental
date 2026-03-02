<<<<<<< HEAD
package com.session13;

import java.util.ArrayList;
import java.util.Iterator;

public class Baitap01 {
    public static void main(String[] args) {
        double total = 0;
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(36.5);
        temperatures.add(40.2);
        temperatures.add(37.0);
        temperatures.add(12.5);
        temperatures.add(39.8);
        temperatures.add(99.9);
        temperatures.add(36.8);
        System.out.println("Danh sách ban đầu: " + temperatures);
        Iterator<Double> iterator = temperatures.iterator();
        while (iterator.hasNext()) {
            Double e = iterator.next();
            if (e < 34 || e > 42) {
                iterator.remove();
            } else {
                total += e;
            }
        }
        System.out.println("Danh sách sau khi lọc: " + temperatures);
        System.out.println("Nhiệt độ trung bình: " + total / temperatures.size());
    }
}
=======
package com.session13;

import java.util.ArrayList;
import java.util.Iterator;

public class Baitap01 {
    public static void main(String[] args) {
        double total = 0;
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(36.5);
        temperatures.add(40.2);
        temperatures.add(37.0);
        temperatures.add(12.5);
        temperatures.add(39.8);
        temperatures.add(99.9);
        temperatures.add(36.8);
        System.out.println("Danh sách ban đầu: " + temperatures);
        Iterator<Double> iterator = temperatures.iterator();
        while (iterator.hasNext()) {
            Double e = iterator.next();
            if (e < 34 || e > 42) {
                iterator.remove();
            } else {
                total += e;
            }
        }
        System.out.println("Danh sách sau khi lọc: " + temperatures);
        System.out.println("Nhiệt độ trung bình: " + total / temperatures.size());
    }
}
>>>>>>> 58c4e6a0b71c2676aec3781a67722cd76e84a295
