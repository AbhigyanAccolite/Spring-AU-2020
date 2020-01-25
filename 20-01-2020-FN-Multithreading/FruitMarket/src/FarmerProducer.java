public class FarmerProducer implements Runnable{
    public void run() {
        if(Market.fruits.size() == 100)
            Market.fruits.notify();

        for(int i = 0; i < 100; i++) {
            synchronized (Market.fruits) {
                if(Market.fruits.size() < 100) {
                    Market.fruits.add(new Fruit(i, Thread.currentThread().getName()));
                    Market.fruits.notify();
                    System.out.println(Thread.currentThread().getName() + " " + Market.fruits.size() + " Produced");
                    try {
                        Thread.currentThread().sleep(100);
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
                else if(Market.fruits.size() == 100)
                    Market.fruits.notifyAll();
                else {
                    try {
                        Market.fruits.wait();
                    }
                    catch(InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}
