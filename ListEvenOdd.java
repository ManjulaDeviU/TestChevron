class ListEvenOddNumbers {

      public static void main(String[] args) {
              
             //define limit
                int limit = 10;
               
               for(int i=1; i <= limit; i++){
                       
                       // if the number is divisible by 2 then it is even
                        if( i % 2 == 0){
                                System.out.print(i + " ");
                        }
                     // else the number is odd
                     else{
                            System.out.println(i +" ");
                     }
                }
        }
}
