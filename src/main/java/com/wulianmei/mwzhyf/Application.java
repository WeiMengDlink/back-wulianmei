package com.wulianmei.mwzhyf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <Description> TODO <br>
 *
 * @author MWZHYF <br>
 * @version 1.0 <br>
 * @CreateDate 2018/9/1017:41<br>
 * @see PACKAGE_NAME <br>
 * @since V1.0 <br>
 */
@SpringBootApplication
@EnableSwagger2
public class Application {
    /**
     *
     * <Description> TODO <br>
     *
     * @author MWZHYF <br>
     * @version 1.0 <br>
     * @param input param <br>
     * @return result
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
