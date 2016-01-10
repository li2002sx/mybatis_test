import com.iubeier.test.entity.UserEntity;
import com.iubeier.test.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jankie on 16/1/9.
 */
public class UserServiceTest extends BaseSpringJunit {

    private static final String TESTID = "1";

    @Autowired
    UserService userService;

    @Before
    public void init(){

    }

    @Test
    public void testGetUserEntityById(){
        UserEntity userEntity = userService.getUserById(TESTID);
        System.out.println(userEntity.getEmail());
        Assert.assertNotNull(userEntity);
    }

}
