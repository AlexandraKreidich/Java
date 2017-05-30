package lab_3.BooolVector2;

import java.lang.Exception;

public class Main {

    public static BoolVector multiply(BoolVector a, BoolVector b) throws Exception {
        if(a.getLength() != b.getLength()) throw new Exception("Размерность векторов разная");
        int[] tmp = new int[a.getLength()];
        for(int i=0; i<a.getLength(); i++){
            tmp[i] = (a.getValue(i) == 1 &&  b.getValue(i) == 1)? 1 : 0;
        }
        BoolVector res = new BoolVector(tmp);
        return res;
    }

    public static BoolVector add(BoolVector a, BoolVector b) throws Exception {
        if(a.getLength() != b.getLength()) throw new Exception("Размерность векторов разная");
        int[] tmp = new int[a.getLength()];
        for(int i=0; i<a.getLength(); i++){
            tmp[i] = (a.getValue(i) == 0 &&  b.getValue(i) == 0)? 0 : 1;
        }
        BoolVector res = new BoolVector(tmp);
        return res;
    }

    public static void main(String[] args) throws Exception{
        BoolVector a = new BoolVector();
        a.initBoolVector();
        System.out.println("vector a: " + a);
        BoolVector b = new BoolVector();
        b.initBoolVector();
        System.out.println("vector b: " + b);
        BoolVector c = new BoolVector(multiply(a,b));
        System.out.println("vector c=a*b: " + c);
        BoolVector d = new BoolVector(add(a,b));
        System.out.println("vector c=a+b: " + d);
        a.negation();
        System.out.println("vector a.negation():" + a);
        System.out.println("vector b: " + b);
        System.out.println("amount of 1 in vector b " + b.count(1));
        System.out.println("amount of 0 in vector b " + b.count(0));
    }
}
