package mvc.repository.impl;

import mvc.config.api.ApiSetting;
import mvc.config.api.QiitaApiSetting;
import mvc.module.IApiExecutor;
import mvc.repository.IQiitaRepository;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

/**
 * Qiita APIを実行するためのレポジトリです。
 */
@Repository
public class QiitaRepository implements IQiitaRepository {

    /**
     * API設定です。
     */
    private final ApiSetting settings;

    /**
     * API実行クラスです。
     */
    private final IApiExecutor apiExecutor;

    /**
     * コンストラクタです。
     *
     * @param settings API設定です。
     * @param apiExecutor API実行クラスです。
     */
    public QiitaRepository(@NonNull @QiitaApiSetting final ApiSetting settings,
                           @NonNull final IApiExecutor apiExecutor) {
        this.settings = settings;
        this.apiExecutor = apiExecutor;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @Nullable
    public String get(@NonNull final String userId) {
        return apiExecutor.get(settings.getUrl() + "/api/v2/users/" + userId);
    }
}
