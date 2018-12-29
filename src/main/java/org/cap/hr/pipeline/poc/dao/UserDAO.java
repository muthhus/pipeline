package org.cap.hr.pipeline.poc.dao;

import org.apache.log4j.Logger;
import org.cap.hr.pipeline.poc.model.User;
import org.cap.hr.pipeline.poc.repository.UserRepository;
import org.cap.hr.pipeline.poc.service.UserService;
import org.cap.hr.pipeline.poc.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserDAO implements UserService {

    private static Logger logger = Logger.getLogger(UserDAO.class);


    private UserRepository userRepository;

    @Autowired
    public UserDAO(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User userSave(UserVO userVO){
        logger.info("Saving User Details ..");
        User user = new User();
        user.setUuid(UUID.randomUUID().toString());
        user.setFirstName(userVO.getFirstName());
        user.setMiddleName(userVO.getMiddleName());
        user.setLastName(userVO.getLastName());
        user.setWard(userVO.getWard());
        user.setCity(userVO.getCity());
        user.setPostCode(userVO.getPostCode());
        user.setCouncil(userVO.getCouncil());
        user.setCounty(userVO.getCounty());

        return userRepository.save(user);
    }
}
