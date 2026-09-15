class recursion_basic {

    // Printing numbers from n to 1
    public static void decreasing(int n) {

        if (n == 1) {
            System.out.println(n + " ");
            return;
        }

        System.out.print(n + " ");
        decreasing(n - 1);
    }

    // Printing numbers from 1 to n
    public static void increasing(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        increasing(n - 1);
        System.out.print(n + " ");
    }

    //Factorial of a number
    //Timme and space complexity = O(n)
    public static int factorial(int n){
        // fac(n) = n * fac(n-1)
        if ( n == 0){
            return 1;
        }
        int F_nm1 = factorial(n-1);
        int F_n = n * F_nm1;
        return F_n;
    }

    //Sum of n Natural numbers
    public static int sum(int n){
        if( n == 1){
            return 1;
        }
        int S_nm1 = sum( n-1 );
        int S_n = n + S_nm1;
        return S_n;

    }

    //print Nth Fibonacci number
    // Fib_n = Fib_nm1 + Fib_nm2
    //Time = O(2^n) Space = O(n)

    public static int fibo(int n){
        
        if ( n == 1 || n == 0){
            return n;
        }

        int Fib_nm1 = fibo(n - 1);
        int Fib_nm2 = fibo(n - 2);
        int Fib_n = Fib_nm1 + Fib_nm2;
        return Fib_n;
    }

    //Checking if an array is sorted or not
    // Time and Space complexity = O(n)
    public static boolean isSorted(int arr[] , int i){
        if ( i == arr.length-1){
            return true;
        }
        if( arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
        
    }

    //First Occurance - Brute force
    public static int frstoccur( int arr[] , int key){
        for(int i = 0; i < arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        } return -1;
    }

    //First Occurance - Recursion
    // time and space = O(n)
    public static int frstoccurres( int arr[] , int i , int key){
        if ( i == arr.length-1){
            return -1;
        }
        
        if(key == arr[i]){
            return i;
        }
        return frstoccurres( arr , i+1 , key);
    }

    // Last occurance 
    public static int lastoccurres( int arr[] , int i , int key){
        if( i == arr.length-1){
            return -1;
        }
        int isFound = lastoccurres(arr, i+1, key);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    //print x^n
    public static int pow ( int x, int n){
        if ( n == 0 ){
            return 1;
        }
        return x * pow ( x , n-1);
       
    }

    // //print x^n optimized
    // // Time complexity : O(n) 
    // // for even : x^ (n/2) * x^ (n/2)
    // // for odd :  x * x^ (n/2) * x^ (n/2)

    // public static int pow_opti ( int x, int n){
    //     if ( n == 0){
    //         return 1;
    //     }
    //     int halfpowerSq = pow_opti( x , n/2 ) * pow_opti( x , n/2 );

    //     //for odd n 
    //     if( n % 2 != 0 ){
    //         halfpowerSq = x * halfpowerSq;
    //     }
    //     return halfpowerSq;
    // }

    //print x^n optimized
    // Time complexity : O(log n) 
    // for even : x^ (n/2) * x^ (n/2)
    // for odd :  x * x^ (n/2) * x^ (n/2)

    public static int pow_opti ( int x, int n){
        if ( n == 0){
            return 1;
        }
        int halfpower = pow_opti( x , n/2 );
        int halfpowerSq = halfpower * halfpower;

        //for odd n 
        if( n % 2 != 0 ){
            halfpowerSq = x * halfpowerSq;
        }
        return halfpowerSq;
    }

    public static void main(String A[]) {
        int x = 5;
        int n = 10;
        int arr[] = {10,20,30,40};

        decreasing(n);
        increasing(n);
        System.out.println(factorial(n));
        System.out.println(sum(n));
        System.out.println(fibo(n));
        System.out.println(isSorted(arr , 0));
        System.out.println(frstoccur(arr , 30));
        System.out.println(frstoccurres( arr , 0 , 30));
        System.out.println(pow(x , n));
        System.out.println(pow_opti(x , n));
        
    }
}