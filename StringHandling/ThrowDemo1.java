class ThrowDemo1 extends RuntimeException{


      static ThrowDemo1  e1=null;
      public static void main(String[] args) throws {
        System.out.println("hello this is after throw statement");
        try{
        //  e1=new ThrowDemo1();
            throw e1;
            System.out.println("hello");
         }catch(ThrowDemo1 obj1){

      }


      }

}
//1.
//2.
//3.
//4.
//5.
//6.
//7.
