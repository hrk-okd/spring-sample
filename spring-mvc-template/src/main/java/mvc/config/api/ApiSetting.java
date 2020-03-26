package mvc.config.api;

import lombok.Data;

/**
 * APIの設定を保持するクラスです。
 */
@Data
public class ApiSetting {

    /**
     * URLを取得します。
     */
    private String url;

    /**
     * タイムアウトを取得します。
     */
    private int timeout;

}
