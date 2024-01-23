package jzxy.cbq;

/**
 * ChatService
 *
 * @author caobaoqi
 */
public class ChatService {

    public static void main(String[] args) {
        System.out.println("Auth-Service: " + Commons.sayHello());
    }

    public static String sayHello(){
        return "Hello I am chat-service";
    }
}
