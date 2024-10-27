package interfaces;

public class WaiterBob implements Waiter {
    @Override
    public void bringOrder(String dish) {
        System.out.println("I brought you " + dish);
    }
}
