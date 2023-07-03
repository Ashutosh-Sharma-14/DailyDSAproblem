package Easy;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {

    }

    static int romanToDecimal(String s){
        int val = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = 0; i < s.length()-1; i++) {
            int curr = map.get(s.charAt(i));
            if(curr < map.get(s.charAt(i+1))){
                val = val - curr;
            }
            else{
                val = val + curr;
            }
        }
        val = val + map.get(s.charAt(s.length()-1));
        return val;
    }

//   optimal solution with no extra space
/*    As per the statement of the problem:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    For cases in which the integer representations of I, X or C can be multiplied by 4 and still be less than the integer representation of the number which follows,
    ** we know that we have to subtract the integer representation of I, X or C from the total.
    (**The number which follows is known because this approach iterates over the string from back to front.) */
    static int romanToInt(String s){
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}
