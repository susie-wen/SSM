import com.susie.dao.UserDaoImp;
import com.susie.service.UserService;
import com.susie.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.security.cert.CertificateParsingException;
/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 9:00
 */
public class MyTest {
    public static void main(String[] args) {
/*        UserService userService=new UserServiceImp();
        //用户实际调用的是业务层，dao层不需要接触
        ((UserServiceImp)userService).setUserDao(new UserDaoImp());
        userService.getUser();*/
        //获取ApplicationContext：拿到spring的容器
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImp userServiceImp=(UserServiceImp) context.getBean("UserServiceImp");
        userServiceImp.getUser();
    }
}
