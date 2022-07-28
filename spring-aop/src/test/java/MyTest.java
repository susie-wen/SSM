import com.kuang.service.UserService;
import com.kuang.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/28 21:26
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //动态代理代理的是接口
        UserService userService= (UserService) context.getBean("userService", UserServiceImp.class);
        userService.add();
    }
}
