class ThrowsDemo1 extends Throwable{
    public static void main(String[]  args) throws ClassNotFoundException{

         Class.forName("ThrowDemo1");
    }
}
