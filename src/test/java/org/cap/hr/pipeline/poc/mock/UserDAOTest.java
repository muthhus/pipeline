package org.cap.hr.pipeline.poc.mock;

import org.cap.hr.pipeline.poc.dao.UserDAO;
import org.cap.hr.pipeline.poc.model.User;
import org.cap.hr.pipeline.poc.repository.UserRepository;
import org.cap.hr.pipeline.poc.service.UserService;
import org.cap.hr.pipeline.poc.vo.UserVO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class UserDAOTest {

    //denpendencies
    private UserService userService;

    //Classes to be tested
    private UserDAO userDAO;

    private UserVO userVO;

    @Mock
    private UserRepository userRepository;

    @Before
    public void setUp() {
        userService = mock(UserService.class);
    }

    @Test
    public void saveTest() throws Exception {
        ArgumentCaptor<UserVO> userArgumentCaptor = ArgumentCaptor.forClass(UserVO.class);

        userService.userSave(userArgumentCaptor.capture());

        verify(userService).userSave(userArgumentCaptor.capture());
    }

    @Test
    public void userSaveMethodTest() throws Exception{
        User user = new User();
        user.setFirstName("Shan");
        String userFirstName = user.getFirstName();
        assertEquals("Shan", userFirstName);

    }

    private UserVO createUserVO(){
        userVO = new UserVO();
        userVO.setFirstName("Shan");
        userVO.setMiddleName("Sundaram");
        userVO.setLastName("Sankara");
        userVO.setWard("Ebbsfleet Valley");
        userVO.setCity("Swanscombe");
        userVO.setCouncil("Dartford");
        userVO.setCounty("Kent");
        userVO.setPostCode("DA10 1BR");

        return userVO;

    }


}
