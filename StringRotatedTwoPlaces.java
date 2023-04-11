public class StringRotatedTwoPlaces {
    public static void main(String[] args) {
        boolean res = isRotated("amazon","azonam");
        System.out.println(res);
    }

    public static boolean isRotated(String str1,String str2){
        int n = str1.length();
        String temp1 = str1.substring(2)+str1.substring(0,2);
        String temp2 = str1.substring(n-2)+str1.substring(0,n-2);
        if( temp1.equals(str2)){
            return true;
        }
        else if(temp2.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
}
