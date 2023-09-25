package practice06.firin;

public class KepekliEkmek implements Ekmek{

    @Override
    public void un() {
        System.out.println("Kemekli ekmek %50 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Kemekli ekmek %38 su içerir");
    }

    @Override
    public void tuz() {
        System.out.println("Kemekli ekmek %1,5 maya içerir");
    }

    @Override
    public void maya() {
        System.out.println("Kemekli ekmek %1,5 tuz içerir");
      }
      public void kepek(){
            System.out.println("Kemekli ekmek %1,5 tuz içerir");
        }
        public void sekil(){
            System.out.println("Kemekli ekmek yuvarlaktır ");
        }

}
