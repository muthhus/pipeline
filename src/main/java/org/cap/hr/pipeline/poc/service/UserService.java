package org.cap.hr.pipeline.poc.service;

import org.cap.hr.pipeline.poc.model.User;
import org.cap.hr.pipeline.poc.vo.UserVO;

public interface UserService {

    public User userSave(UserVO userVO) throws Exception;
}
