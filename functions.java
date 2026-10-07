public class functions
{   
// .......................................................... Constant...................................................
    final static double PI = 3.141592654;
    final static double E = 2.718281828;
//  ...................................................Simple calculations................................................
    public static long add( long a, long b){ 
        System.out.println(a+a);
        return  a + b;
    }
    public static long sub( long a, long b){
        System.out.println(a-b);
        return  a - b;
    }
    public static long multply( long a, long b){
        System.out.println(a*b);
        return  a * b;
    }
    public static long divid( long a, long b){
        System.out.println(a / b);
        return  a / b;
    }
    // double
        public static double add( double a, double b){ 
            System.out.println( a + b );
        return  a + b;
    }
    public static double sub( double a, double b){
        System.out.println( a - b);
        return  a - b;
    }
    public static double multply( double a, double b){
        System.out.println( a * b );
        return  a * b;
    }
    public static double divid( double a, double b){
        System.out.println(a / b);
        return  a / b;
    }
    
//.............................................................factorial....................................................
    public static long factorial(long n) {
    
            if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
            }
      else if (n == 0 || n == 1) {
          return 1;
        }
        long result = 1;
        for (long i = 1; i <= n; i++) {
          result *= i;}
          System.out.println(result);
          return result;
      }
//..........................................................absolute value....................................................
    public static double abs(double x){
        double result ;
        if (x>=0){
            result = x;
             System.out.println(result);
            return x;
        }else {
            result = -1*x;
             System.out.println(result);
            return -1*x;
        }
        
    }
//..........................................................power function.....................................................
    public static double powerFunction(double base, long exponent) {
    double result = 1;
    for (long i = 0; i < exponent; i++) {
        result *= base;
    }
        System.out.println(result);
    return result; 
    } 
//.................................................Permutations and combinations.................................................
    public static long C(long n, long r){
        System.out.println(factorial(n)/(factorial(r)*factorial(n-r)));
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
     public static long P(long n, long r){
        System.out.println(factorial(n)/factorial(n-r));
        return factorial(n)/factorial(n-r);
    }
//....................................................Trigonometric functions...................................................
    public static double convertDegToRad(double deg){
        System.out.println(deg*(PI/180));
       return deg*(PI/180);
    }
    public static double convertRadToDeg(double Rad){
        System.out.println(Rad*(180/PI));
       return Rad*(180/PI);
    }
    public static double sin(double deg){
        double rad = convertDegToRad(deg);
        double term = rad;
        double sum = term;
        for (int n = 1; abs(term) > 1e-10; n++) {
            term *= -1 * rad * rad / (2 * n * (2 * n + 1));
            sum += term;
        }
        System.out.println(sum);
        return sum;
    }
    public static double cos(double deg){
        double rad = convertDegToRad(deg);
        double term = 1;
        double sum = term;
        for (int n = 1; abs(term) > 1e-10; n++) {
            term *= -1 * rad * rad / (2 * n * (2 * n - 1));
            sum += term;
        }
        System.out.println(sum);
        return sum;
    }
    public static double tan(double deg){
        double cosValue = cos(deg);
        if (abs(cosValue) < 1e-10) {
            throw new IllegalArgumentException("Tangent is undefined for angles where cosine is zero.");
        }
        System.out.println(sin(deg)/cosValue);
        return sin(deg) / cosValue;
    }
    public static double cot(double deg){
        double sinValue = sin(deg);
        if (abs(sinValue) < 1e-10) {
            throw new IllegalArgumentException("Cotangent is undefined for angles where sine is zero.");
        }
        System.out.println(cos(deg)/sinValue);
        return cos(deg) / sinValue;
    }
    public static double sec(double deg){
        double cosValue = cos(deg);
        if (abs(cosValue) < 1e-10) {
            throw new IllegalArgumentException("Secant is undefined for angles where cosine is zero.");
        }
        System.out.println(1/cosValue);
        return 1 / cosValue;
    }
    public static double csc(double deg){
        double sinValue = sin(deg);
        if (abs(sinValue) < 1e-10) {
            throw new IllegalArgumentException("Cosecant is undefined for angles where sine is zero.");
        } 
        System.out.println(1/sinValue);
        return 1 / sinValue;
    }
//...............................................Square root using Newton's method.................................................
    public static double sqrt(double S){
      if ( S==0 ) return 0;
      if ( S<0 ) throw new IllegalArgumentException();
      double x = S ;
      double tolerance = 1e-10;
      for(int i =0;i<100;i++){
        double next = 0.5*(x+S/x);
        if ( abs(next-x)<tolerance) return next ;
        x = next;
      }
      System.out.println(x);
      return x;
    }
//...........................................................percentage............................................................
    public static double percentage(double p,double b){
       return p*b/100;
    }
//........................................................square function.........................................................
    public static double square(double p){
        return powerFunction(p, 2);
    }
//...................................................Quadratic equation solver...................................................
        public static double[] twodegequa(double a, double b, double c){
      double delta = (square(b))-4*a*c;
      double[] arr = new double[2];
      if (delta>=0){
        arr[0] = (-b+sqrt(delta))/(2*a);
        arr[1] = (-b-sqrt(delta))/(2*a);
      }
      System.out.println("Roots: " + arr[0] + ", " + arr[1]);
      return arr ;
    }
     

    public static void main(String args[]){
   
    
    
    twodegequa(1, -4, 2);
    
    
    }
   
   
}