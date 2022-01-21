package assignment8;

public class DecimalBinary {
    public int converter(int deci) {
        if (deci == 0) return 0;
        String s = "";
        return Integer.valueOf(converter(deci, s));
    }


    public String converter(int deci, String binar) {

        if (deci == 0) return binar;
        int reminder = deci % 2;
        int result = deci / 2;
        String nahi = reminder + binar;
        return converter(result, nahi);
    }

    public static void main(String[] args) {
        DecimalBinary binary = new DecimalBinary();
        System.out.println(binary.converter(100));
    }
}
