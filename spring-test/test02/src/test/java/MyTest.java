import com.susie.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 10:36
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        User user=(User)context.getBean("userNew");
        user.show();

    }
}
