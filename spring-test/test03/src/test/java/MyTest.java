import com.susie.pojo.Address;
import com.susie.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 15:25
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student) context.getBean("student");
//        Address address=(Address) context.getBean("address");
        System.out.println(student.getName());
        System.out.println(student.toString());
    }

}
