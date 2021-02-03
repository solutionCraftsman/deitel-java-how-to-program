package eleven;

public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Beans plateOfBeans;
        try {
            plateOfBeans = messenger.orderBeansWith(300, 3, true, true);
            System.out.println(plateOfBeans);
        } catch (Exception caughtException) {
            System.out.println(caughtException.getMessage());
            caughtException.printStackTrace();
        }
    }
}
