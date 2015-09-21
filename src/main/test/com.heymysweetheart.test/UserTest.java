import com.credit.model.User;
import com.credit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.junit.Before;

/**
 * Created by leo on 15/8/2.
 */
public class UserTest {
    private UserService userService;

    @Before
    public void before() {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                , "classpath:conf/spring-mybatis.xml"});

        userService = (UserService) context.getBean("userServiceImpl");
    }

    @Test
    public void addUser() {
        User user = new User(5,5,"tom");
        System.out.println(userService.insertUser(user));
    }
}
