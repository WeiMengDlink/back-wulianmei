package com.wulianmei.mwzhyf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;

/**
 * <Description> TODO <br>
 *
 * @author MWZHYF <br>
 * @version 1.0 <br>
 * @CreateDate 2018/9/1020:15<br>
 * @see com.wulianmei.mwzhyf.model <br>
 * @since V1.0 <br>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    private Long id;
    private String  username;
    private Integer age;
    private String  phone;
    private String  email;
    private String  aboutme;
    private String  password;
    private Integer type;
    private String question;
    private String answer;
    private String identify;
    private String quality;
    private Date birthday;
    private Date createTime;
    private Date updateTime;
    private String  avatar;
    private Integer role;
}
