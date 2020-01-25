public class UserConsumer implements  Runnable{
    public void run() {
        synchronized (Market.fruits) {
            while(true) {
                if(!Market.fruits.isEmpty()) {
                    switch (Thread.currentThread().getName()) {
                        case "orangeConsumer": {
                            for(int i = 0; i < 100 && Market.fruits.size() > i; i++) {
                                if(Market.fruits.get(i).type == "orange" ) {
                                    Market.fruits.remove(i);
                                    System.out.println("Consumed " + i + " " + Thread.currentThread().getName());
                                    try {
                                        Thread.currentThread().sleep(100);
                                    }
                                    catch(InterruptedException e) {
                                        System.out.println(e);
                                    }
                                    Market.fruits.notify();
                                }
                                else if(i == 99 && Market.fruits.get(i).type != "orange" ) {
                                    try {
                                        System.out.println("I am in 2nd if");

                                        Market.fruits.wait();
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }
                                else {
                                    try {
                                        System.out.println("I am in 2nd if");

                                        Market.fruits.wait();
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }
                            }

                            break;
                        }

                        case "grapeConsumer": {
                            for(int i = 0; i < 100 && Market.fruits.size() > i; i++) {
                                if(Market.fruits.get(i).type == "grape" ) {
                                    Market.fruits.remove(i);
                                    System.out.println("Consumed " + i + " " + Thread.currentThread().getName());
                                    try {
                                        Thread.currentThread().sleep(100);
                                    }
                                    catch(InterruptedException e) {
                                        System.out.println(e);
                                    }
                                    Market.fruits.notify();
                                }
                                else if(i == 99 && Market.fruits.get(i).type != "grape") {
                                    try {
                                        System.out.println("I am in 2nd if");

                                        Market.fruits.wait();
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }
                                else {

                                    try {
                                        System.out.println("I am in 3rd if");

                                        Market.fruits.wait();
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }

                            }
                            break;
                        }


                        case "watermelonConsumer": {

                            for(int i = 0; i < 100 &&  Market.fruits.size() > i; i++) {
                                if(Market.fruits.get(i).type == "watermelon" ) {
                                    Market.fruits.remove(i);
                                    System.out.println("Consumed " + i + " " + Thread.currentThread().getName());

                                    try {
                                        Thread.currentThread().sleep(100);
                                    }
                                    catch(InterruptedException e) {
                                        System.out.println(e);
                                    }
                                    Market.fruits.notify();
                                }
                                else if(i == 99 && Market.fruits.get(i).type != "watermelon") {
                                    try {
                                        System.out.println("I am in 2nd if");

                                        Market.fruits.wait();
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }
                                else {
                                    try {
                                        System.out.println("I am in 3rd if");

                                        Market.fruits.wait();
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }
                            }
                            break;
                        }

                        case "appleConsumer": {
                            for(int i = 0; i < 100 && Market.fruits.size() > i; i++) {
                                if(Market.fruits.get(i).type == "apple" ) {
                                    Market.fruits.remove(i);
                                    System.out.println("Consumed " + i + " " + Thread.currentThread().getName());

                                    try {
                                        Thread.currentThread().sleep(100);
                                    }
                                    catch(InterruptedException e) {
                                        System.out.println(e);
                                    }
                                    Market.fruits.notify();
                                }
                                else if(i == 99 && Market.fruits.get(i).type != "apple") {
                                    try {
                                        System.out.println("I am in 2nd if");
                                        Market.fruits.wait();
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }
                                else {
                                    try {
                                        System.out.println("I am in 3rd if");

                                        Market.fruits.wait();
                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                else {
                    try {
                        Market.fruits.wait();
                    }
                    catch(InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }
}
