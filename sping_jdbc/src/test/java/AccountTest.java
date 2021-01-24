import com.xiaoshitou.dao.Impl.AccountDaoImpl;
import com.xiaoshitou.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

public class AccountTest {


    @Test
    public void ma(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Bean.xml");
        AccountDaoImpl bean = applicationContext.getBean("account", AccountDaoImpl.class);
       // Account account = applicationContext.getBean("accountdo", Account.class);



       // bean.baa(account);

        List<Account> fanall = bean.fanall();
        System.out.println(fanall);
    }
}
