package lab_3.BooolVector2;

public class BoolVector {
    static final int STANDART_VAL = 10;

    private int vect[];

    public BoolVector(){
        this.vect = new int[STANDART_VAL];
    }

    public BoolVector(int n){
        this.vect = new int[n];
    }

    public BoolVector(BoolVector a) throws Exception{
        this.vect = new int[a.getLength()];
        for(int i=0; i<a.getLength(); i++) {
            this.vect[i] = a.getValue(i);
        }
    }

    public BoolVector(int[]arr){
        this.vect = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            this.vect[i] = arr[i];
        }
    }

    public void initBoolVector() {
        for (int i = 0; i < this.vect.length; i++) {
            this.vect[i] = (int) (Math.random() * 2);
        }
    }

    public int getLength(){
        return this.vect.length;
    }

    public int getValue(int i)throws Exception{
        if(i>this.vect.length) throw new Exception("значение больше размерности вектора");
        return this.vect[i];
    }

    public void negation(){
        for(int i = 0; i< this.vect.length; i++) {
            this.vect[i] = (this.vect[i] == 1) ? 0 : 1;
        }
    }

    public int count(int number){
        int count=0;
        for(int i: this.vect){
            if(i == number) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i =0; i<this.vect.length; i++) {
            builder.append(this.vect[i]);
        }
        builder.append("]");
        return builder.toString();
    }
}
