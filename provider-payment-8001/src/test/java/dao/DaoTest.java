package dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;


/**
 * @author - a89010531111@gmail.com
 */
@SpringBootTest
public class DaoTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws Exception {
        System.out.println("获取的数据库连接为:" + dataSource.getConnection());
    }

}
