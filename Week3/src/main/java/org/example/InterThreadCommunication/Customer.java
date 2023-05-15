package org.example.InterThreadCommunication;

class Customer{
    int amount;

    public Customer(int amount) {
        this.amount = amount;
    }

    synchronized void withdraw(int withdraw){
        System.out.println("going to withdraw...");
        while(this.amount<withdraw){
            System.out.println("Less balance; waiting for deposit...");
            try{
                wait();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        this.amount-=withdraw;
        System.out.println("withdraw of Rs. " + withdraw + " completed...");
    }
    synchronized void deposit(int deposit){
        System.out.println("going to deposit...");
        this.amount+=deposit;
        System.out.println("deposit of Rs. "+deposit+ " completed... ");
        notifyAll();
    }
    public static void main(String[] args){
          Customer c=new Customer(10000);
          Thread withdraw=new Thread(()->{
              c.withdraw(1000);
        });
//        new Thread(() -> c.withdraw(15000)).start();
//        new Thread(() -> c.withdraw(12000)).start();
//        new Thread(() -> c.deposit(30000)).start();
    }
}
