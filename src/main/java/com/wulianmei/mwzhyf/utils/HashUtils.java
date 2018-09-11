package com.wulianmei.mwzhyf.utils;

import com.google.common.base.Throwables;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * <Description> TODO <br>
 * encry password and unencry password
 * @author MWZHYF <br>
 * @version 1.0 <br>
 * @CreateDate 2018/9/1021:07<br>
 * @see com.wulianmei.mwzhyf.utils <br>
 * @since V1.0 <br>
 */
public class HashUtils {
    private static final HashFunction HASH_FUNCTION = Hashing.md5();

    private static final HashFunction MURMUR_FUNCTION = Hashing.murmur3_128();

    private static final String       SALT     = "wumeilian.com";
    /**
     *
     * <Description> TODO <br>
     *
     * @author MWZHYF <br>
     * @version 1.0 <br>
     * @param input param <br>
     * @return result
     */
    public static String encryPassword(String password){
        HashCode code = HASH_FUNCTION.hashString(password+SALT, Charset.forName("UTF-8"));
        return code.toString();
    }
    /**
     *
     * <Description> TODO <br>
     *
     * @author MWZHYF <br>
     * @version 1.0 <br>
     * @param input param <br>
     * @return result
     */
    public static String hashString(String input){
        HashCode code = null;
        try {
            code = MURMUR_FUNCTION.hashBytes(input.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            Throwables.propagate(e);
        }
        return code.toString();
    }

}
