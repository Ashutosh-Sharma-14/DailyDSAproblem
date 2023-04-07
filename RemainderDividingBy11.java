public class RemainderDividingBy11 {
    public static void main(String[] args) {

    }

    static int xmod11(String x){
        int val = Integer.parseInt(x.substring(0,2)) % 11;
        for (int i = 2; i < x.length(); i++) {
            val = Integer.parseInt((char) val + "" + x.charAt(i)) % 11;
        }
        return val;
    }
}
