package com.wulianmei.mwzhyf.service;

import com.wulianmei.mwzhyf.model.User;

/**
 * <Description> TODO <br>
 *
 * @author MWZHYF <br>
 * @version 1.0 <br>
 * @CreateDate 2018/9/1020:02<br>
 * @see com.wulianmei.mwzhyf.service <br>
 * @since V1.0 <br>
 */
public interface UserService {
    User queryUser(String id);

    User createUser(User user);
}
