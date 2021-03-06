package kg.megacom;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int height = 11;

        List<Integer> radiusList = new ArrayList<>(Arrays.asList(3, -6, 11, -5, 22));
        radiusList.get(1);
        for (int i = 0; i < radiusList.size(); i++) {
            try {
                cylinderVol(radiusList.get(i), height);
            } catch (NegativeValueException e) {
                e.printStackTrace();
                System.out.println("Радиус отрицательный: " + radiusList.get(i));
            }
        }
    }

    public static void cylinderVol(int radius, int height) throws NegativeValueException {
        if (radius < 0) {
            throw new NegativeValueException("Радиус не должен быть отрицательным");
        } else {
            DecimalFormat f = new DecimalFormat("##.00");
            System.out.println("Радиус: " + radius + " м; Высота " + height + " м; объём = " + f.format(Math.PI * Math.pow(radius, 2) * height) + " м\u00b3");
        }

    }
}
