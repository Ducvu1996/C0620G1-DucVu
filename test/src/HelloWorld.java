public class HelloWorld {
    public static void main(String []args){
        System.out.println("Hello World");
        int[] array = {99,88,5,1,5,55,2,6,77,4,2,5};
        System.out.println(findMax2(array));
    }
    public static int findMax2( int[] array){
        int max1 = array[0] ;
        int max2 = array[1];

        for(int i =0; i<array.length ;i++){
            if(array[i]>max1){
                max2=max1;
                max1 = array[i];
            }

        }
    return max2;
    }
}
