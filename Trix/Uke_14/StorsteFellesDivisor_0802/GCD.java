class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(6,2));
        System.out.println(gcdIterativ(6, 2));
    }


    public static int gcd(int a, int b) {

        if (a < b) {
            int t = b;
            b = a;
            a = t;
        }

        int c = a % b;

        if (c == 0) {
            return b;
        }
        else {
            return gcd(b,c);
        }
    }

    public static int gcdIterativ(int a, int b) {


        if (a < b) {
            int t = b;
            b = a;
            a = t;
        }
        
        int c = a % b;
        
        while(c != 0) {
            a = b;
            b = c;
            
            c = a % b;
        }
        return b;
    }
}