package DependencyInjection;

/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Wed, 6/29/2022
 * Time     : 17:11
 * Filename : SMSServiceImpl
 */
public class SMSServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send SMS
        System.out.println("SMS sent to " + rec + " with Message=" + msg);
    }
}
