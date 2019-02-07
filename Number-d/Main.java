import java.util.ArrayList;

public class Main {

    public static int maxDigits = 9;

    public static void main(String[] args) {

        int[]values = {0,1,63,127,255,256};

        for(int x : values){
            System.out.printf("%3d: (Binary) %s (Octal) %s (Hex) %s\n", x, toBinary(x), toOctal(x), toHex(x));
        }

//        //Uncomment below for Extra Credit
//
//        System.out.println("\nExtra Credit:");
//
//        for(int x : values){
//            System.out.printf("%3d: %s %s %s\n", x, toAnyBase(x,2), toAnyBase(x,8), toAnyBase(x,16));
//        }
    }


    public static String toBinary(int dec){

        String binary = "";
        ArrayList binaryDigits = new ArrayList();

        for (int position = maxDigits; position > 0; position-- ) {
            int positionBaseValue = (int) Math.pow(2, position - 1);
            int binaryIntAtPosition = dec/positionBaseValue;

            binaryDigits.add(binaryIntAtPosition);

            dec = dec%positionBaseValue;
        }

        for(int i = 0; i < maxDigits; i++){
            binary+=binaryDigits.get(i).toString();
        }

        return binary;
    }

    public static String toOctal(int dec){

        String octal = "";
        ArrayList octalDigits = new ArrayList();

        for (int position = maxDigits; position > 0; position-- ) {
            int positionBaseValue = (int) Math.pow(8, position - 1);
            int octalIntAtPosition = dec/positionBaseValue;

            octalDigits.add(octalIntAtPosition);

            dec = dec%positionBaseValue;
        }

        for(int i = 0; i < maxDigits; i++){
            octal+=octalDigits.get(i).toString();
        }

        return octal;
    }

    public static String toHex(int dec){

        String hex = "";

        ArrayList<String> hexStrings = new ArrayList();
        hexStrings.add("0");
        hexStrings.add("1");
        hexStrings.add("2");
        hexStrings.add("3");
        hexStrings.add("4");
        hexStrings.add("5");
        hexStrings.add("6");
        hexStrings.add("7");
        hexStrings.add("8");
        hexStrings.add("9");
        hexStrings.add("A");
        hexStrings.add("B");
        hexStrings.add("C");
        hexStrings.add("D");
        hexStrings.add("E");
        hexStrings.add("F");

        ArrayList hexDigits = new ArrayList();

        for (int position = maxDigits; position > 0; position-- ) {
            int positionBaseValue = (int) Math.pow(16, position - 1);
            int hexIntAtPosition = dec/positionBaseValue;

            hexDigits.add(hexStrings.get(hexIntAtPosition));

            dec = dec%positionBaseValue;
        }

        for(int i = 0; i < hexDigits.size(); i++){
            hex+=hexDigits.get(i);
        }

        return hex;
    }

    //Extra Credit

    public static String toAnyBase(int dec, int base){

        String convertedVal = "(Base: " + Integer.toString(base) + ") ";

        if(base>16){
            return convertedVal + "invalid base";
        }

        ArrayList<String> baseStrings = new ArrayList();
        baseStrings.add("0");
        baseStrings.add("1");
        baseStrings.add("2");
        baseStrings.add("3");
        baseStrings.add("4");
        baseStrings.add("5");
        baseStrings.add("6");
        baseStrings.add("7");
        baseStrings.add("8");
        baseStrings.add("9");
        baseStrings.add("A");
        baseStrings.add("B");
        baseStrings.add("C");
        baseStrings.add("D");
        baseStrings.add("E");
        baseStrings.add("F");

        ArrayList digits = new ArrayList();

        for (int position = maxDigits; position > 0; position-- ) {
            int positionBaseValue = (int) Math.pow(base, position - 1);
            int intAtPosition = dec/positionBaseValue;

            digits.add(baseStrings.get(intAtPosition));

            dec = dec%positionBaseValue;
        }

        for(int i = 0; i < digits.size(); i++){
            convertedVal+=digits.get(i);
        }

        return convertedVal;
    }
}
