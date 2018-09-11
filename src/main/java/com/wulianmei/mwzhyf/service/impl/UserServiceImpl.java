package com.wulianmei.mwzhyf.service.impl;

import com.wulianmei.mwzhyf.model.User;
import com.wulianmei.mwzhyf.repository.UserRespository;
import com.wulianmei.mwzhyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <Description> TODO <br>
 *
 * @author MWZHYF <br>
 * @version 1.0 <br>
 * @CreateDate 2018/9/1020:03<br>
 * @see com.wulianmei.mwzhyf.service <br>
 * @since V1.0 <br>
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository userRespository;
    @Override
    public User queryUser(String id) {
        return userRespository.getOne(id);
    }

    @Override
    public User createUser(User user) {
        return userRespository.save(user);
    }
}
