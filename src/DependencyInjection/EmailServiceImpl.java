package DependencyInjection;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 17:11
 * Filename : EmailServiceImpl
 */
public class EmailServiceImpl implements MessageService{
    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send email
        System.out.println("Email sent to "+rec+ " with Message="+msg);
    }
}
