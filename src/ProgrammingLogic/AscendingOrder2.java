package ProgrammingLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AscendingOrder2 {
    public static void main(String[] args) {

/*        int[] arr = {155, 5, 2566};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        ArrayList<Double> numberList = new ArrayList<>();
        numberList.add(3.68);
        numberList.add(6.68);
        numberList.add(7.68);
        numberList.add(38.68);
        Collections.sort(numberList);

        for (Double numero : numberList) {
        System.out.println(numero);
        }

    }
}
