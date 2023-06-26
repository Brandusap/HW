public class Human implements Vietate, InterfataA{
    String email;
    String address;

    public static String planet;


    public void verify(){
        System.out.println("Verifies email");
    }
    public void sendEmail(){
        System.out.println("Send email");
    }

    @Override
    public void metodaInterfata() {

    }

    @Override
    public void metodaInterfataA() {

    }
}
