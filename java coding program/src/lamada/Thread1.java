package lamada;

public class Thread1
{
    public static void main(String[] args) {

        Runnable thread1 = ()->{

            for (int i=1;i<=10;i++){

                System.out.println("value of i" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            }

        };

        Thread thread= new Thread(thread1);
        thread.setName("Ahmed khan");
        thread.start();
    }
}
