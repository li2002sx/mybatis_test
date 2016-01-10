import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jankie on 16/1/9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/conf/mybatis-config.xml","classpath*:/conf/spring-mybatis.xml"})
@Transactional
public class BaseSpringJunit {

    @Test
    public void initEmpty(){

    }
}
