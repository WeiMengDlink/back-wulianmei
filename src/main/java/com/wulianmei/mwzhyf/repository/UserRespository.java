package com.wulianmei.mwzhyf.repository;

import com.wulianmei.mwzhyf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <Description> TODO <br>
 *
 * @author MWZHYF <br>
 * @version 1.0 <br>
 * @CreateDate 2018/9/1020:30<br>
 * @see com.wulianmei.mwzhyf.repository <br>
 * @since V1.0 <br>
 */
public interface UserRespository extends JpaRepository<User, String> {
}
