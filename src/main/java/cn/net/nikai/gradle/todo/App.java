package cn.net.nikai.gradle.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * todo cn.net.nikai.gradle.todo
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 1:21 2018/5/11
 * @Modified By:
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("--------------------------------------------------begin");
        System.out.println("gradle test");
        logger.info("----------------------------------------------------end");
    }
}
