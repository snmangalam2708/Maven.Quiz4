package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {

        return Math.sqrt(value);
    }

    public static Double square(Double value) {

        return Math.pow(value,2);
    }

    public static Double[] squareRoots(Double... value) {

        Double[] newArray= new Double[value.length];
        int i =0;

        for (i =0; i<value.length; i++)
             {
                 newArray[i] = Math.pow(value[i],.5);
        }

        return newArray;
    }

    public static Double[] squares(Double... values) {

        Double[] newArray= new Double[values.length];
        int i =0;

        for (i =0; i<values.length; i++)
        {
            newArray[i] = Math.pow(values[i],2);
        }
        return newArray;
    }

    public static Double add(Double value1, Double value2) {

        return value1+value2;
    }

    public static Double subtract(Double value1, Double value2) {

        return value1-value2;
    }


    public static Double divide(Double divisor, Double dividend) {

        if (dividend != 0)
            return divisor / dividend;
        else return 0.0;
    }

}
