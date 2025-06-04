class RecursionDemo{
    static int sumNaturalNumber(int n){
        if(n==1){
            return 1;
        }else{
            return n+sumNaturalNumber(n-1);
        }
    }
    public static void main(String[]args){
        int number=10;
        int result=sumNaturalNumber(number);
        System.out.println("sum of first"+number+"natural number is"+result);
    }
}
    