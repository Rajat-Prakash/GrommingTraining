package org.example.FacadeDesign;

public class OrderFacade {
    AddressVerification addressVerification;
    PaymentService paymentService;

    public OrderFacade() {
        this.addressVerification = new AddressVerification();
        this.paymentService = new PaymentService();
    }

    void placeOrder(String city, int pinCode, String paymentMethod, int amount){
        if(addressVerification.isValidAddress(city,pinCode)){
            paymentService.payment(paymentMethod,amount);
            System.out.println("Order placed");
        }
        else{
            System.out.println("Not a valid address");
        }
    }

    public static void main(String[] args) {
        OrderFacade order=new OrderFacade();
        order.placeOrder("Delhi",110062,"Credit card",1000);
    }
}
