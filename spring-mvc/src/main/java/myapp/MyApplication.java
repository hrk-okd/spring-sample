package myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * エントリクラスです。
 */
@SpringBootApplication
public class MyApplication {

    /**
     * アプリケーションコンテキストです。
     */
    private static ApplicationContext applicationContext;

    /**
     * エントリポイントです。
     *
     * @param args Javaの引数
     */
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MyApplication.class);
        applicationContext = application.run(args);
    }
}