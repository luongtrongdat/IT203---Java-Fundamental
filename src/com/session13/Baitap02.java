<<<<<<< HEAD
package com.session13;

import java.util.ArrayList;
import java.util.Collections;

public class Baitap02 {
    public static void main(String[] args) {
        ArrayList<String> medicine = new ArrayList<>();
        medicine.add("Paracetamol");
        medicine.add("Ibuprofen");
        medicine.add("Panadol");
        medicine.add("Paracetamol");
        medicine.add("Aspirin");
        medicine.add("Ibuprofen");
        System.out.println("Input: " + medicine);
        ArrayList<String> result = new ArrayList<>();
        for (String e : medicine) {
            if (!result.contains(e)) {
                result.add(e);
            }
        }
        Collections.sort(result);
        System.out.println("Output: " + result);
    }
}
=======
package com.session13;

import java.util.ArrayList;
import java.util.Collections;

public class Baitap02 {
    public static void main(String[] args) {
        ArrayList<String> medicine = new ArrayList<>();
        medicine.add("Paracetamol");
        medicine.add("Ibuprofen");
        medicine.add("Panadol");
        medicine.add("Paracetamol");
        medicine.add("Aspirin");
        medicine.add("Ibuprofen");
        System.out.println("Input: " + medicine);
        ArrayList<String> result = new ArrayList<>();
        for (String e : medicine) {
            if (!result.contains(e)) {
                result.add(e);
            }
        }
        Collections.sort(result);
        System.out.println("Output: " + result);
    }
}
>>>>>>> 58c4e6a0b71c2676aec3781a67722cd76e84a295
