class TV{
  //data ---properties

   static String brandName;
   int tvid;

  //method--funationalities

    void switchOn(){
      System.out.println(this.hashCode()+"==>TV started "+brandName);
      System.out.println(this.hashCode()+"==>TV id is "+tvid);

        System.out.println(this.hashCode()+"==>TV color is "+tvcolor);
    }

    void switchOff(){
      System.out.println(this.hashCode()+"==>TV switchOff "+brandName);
      System.out.println(this.hashCode()+"==>TV id is "+tvid);
    }

}

class ClassObjectDemo1{

  //this is main method
    public static void main(String[] args) {

        TV.brandName="SAMSUNG";
        TV  tv1=new TV();// object creation syntax-->1. object  2. object reference 3. object reference variable
          tv1.tvid=111;
        tv1.switchOn();//method call
          tv1.switchOff();

        TV  tv2=new TV();// object creation syntax
        tv2.tvid=222;
        tv2.switchOn();

         tv2.switchOff();


    }
}
