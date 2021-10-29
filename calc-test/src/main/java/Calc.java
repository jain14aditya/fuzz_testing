import java.util.*;
import java.util.Scanner;
public class Calc {
        int calc(String inp, int op) {
            String[] input = inp.split(",");
            int i = Integer.valueOf(input[0]);
            int j = Integer.valueOf(input[1]);
            switch (op){
                case 1:
                    return i+j;
                case 2:
                    return i-j;
                case 3:
                    return i*j;
                case 4:
                   return i/j;
                default:
                    return -1;

            }
        }
}
