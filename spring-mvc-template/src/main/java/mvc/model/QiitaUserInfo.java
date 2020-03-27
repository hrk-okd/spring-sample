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

    private int followeesCount;

    private int followersCount;

    private String githubLoginName;

    private String id;

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

