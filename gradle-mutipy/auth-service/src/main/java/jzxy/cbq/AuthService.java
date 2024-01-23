package jzxy.cbq;

/**
 * AuthService
 *
 * @author caobaoqi
 */
public class AuthService {
    public static void main(String[] args) {
        System.out.println("Auth-Service: " + Commons.sayHello());
    }

    public static String sayHello(){
        return "Hello I am auth-service";
    }
}
