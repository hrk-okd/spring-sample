package mvc;

import lombok.Getter;
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
    @Getter
    private static ApplicationContext APPLICATION_CONTEXT;

    /**
     * エントリポイントです。
     *
     * @param args Javaの引数
     */
    public static void main(String[] args) {
        APPLICATION_CONTEXT = SpringApplication.run(MyApplication.class, args);
    }
}
