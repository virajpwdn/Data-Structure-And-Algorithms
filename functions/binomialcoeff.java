package functions;

public class binomialcoeff {
    public static int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static int binomial(int n, int r){
        return fact(n) / (fact(r) * fact(n-r));
    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println(binomial(n, r));
    }
}


// public static int binomial(int n, int r){
    //     int factN = 1;
    //     int factR = 1;
    //     int nMinr = 0;
    //     int formula = 1;

    //     for(int i=1; i<=n; i++){
    //         factN *= i;
    //     }
    //     for(int i=1; i<=r; i++){
    //         factR *= i;
    //     }
        
    //     nMinr = factN - factR;
    //     for(int i=1; i<=nMinr; i++){
    //         formula *= i;
    //     }

    //     int binomialCoefficient = factN / factR * formula;
    //     return binomialCoefficient;
    // }

    // public static void main(String[] args) {
    //     int n = 5, r = 4;
    //     System.out.println(binomial(n, r));
    // }