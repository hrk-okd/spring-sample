package mvc.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

/**
 * Qiitaのユーザ情報です。
 */
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class QiitaUserInfo {

    /**
     * 説明です。
     */
    private String description;

    /**
     * FacebookのIDです。
     */
    private String facebookId;

    /**
     * フォロー数です。
     */
    private int followeesCount;

    /**
     * フォロワー数です。
     */
    private int followersCount;

    private String githubLoginName;

    /**
     * QiitaのIDです。
     */
    private String id;

    /**
     * 投稿数です。
     */
    private int itemsCount;

    private String linkedinId;

    private String location;

    private String name;

    private String organization;

    private String permanentId;

    private String profileImageUrl;

    private boolean teamOnly;

    private String twitterScreenName;

    private String websiteUrl;
}

