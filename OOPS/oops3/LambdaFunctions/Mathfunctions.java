package LambdaFunctions;

public class Mathfunctions implements Math {

    // @Override
    // public int math(int a, int b) {

    // }
    private int operate(int a, int b, Math mt){
        return mt.math(a, b);
    }
}
