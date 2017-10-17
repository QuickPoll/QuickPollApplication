package skuniv.ac.kr.quickpollapplication.UI;

import android.os.Bundle;

import skuniv.ac.kr.quickpollapplication.R;


/**
 * Created by gunyoungkim on 2017-09-07.
 */

public class QuickPollTabsConfig {
    public static QuickPollTabsConfig.TabInfo[] TABINFOS = {
            new QuickPollTabsConfig.TabInfo( "사용자", R.drawable.questionimage, R.drawable.questionimage, QuizListFragment.class, null),
            new QuickPollTabsConfig.TabInfo( "알람1", R.drawable.ranking_image, R.drawable.ranking_image, RankListFragment.class, null),
    };

    public static final class TABINDEX {
        public static final int USERLIST = 0;
        public static final int CHANNELLIST = 1;
        public static final int SETTINGS = 2;
        public static final int SECOND = 1;
        public static final int THIRD = 2;
        public static final int FIRST = 0;
        public static final int LAST = TABINFOS.length;
    };

    public static final int COUNT_TABS() {
        return TABINFOS.length;
    }

    public static final QuickPollTabsConfig.TabInfo TABINFO(int index ) {
        return ( index < 0 || index >= COUNT_TABS() )  ? null : TABINFOS[ index ];
    }

    public static final class TabInfo {
        public final String tag;
        public final int drawableNormal;
        public final int drawableSelected;
        public final Class<?> klass;
        public final Bundle bundle;
        TabInfo( String tag, int drawableNormal, int drawableSelected, Class<?> klass, Bundle bundle ) {
            this.tag = tag;
            this.drawableNormal = drawableNormal;
            this.drawableSelected = drawableSelected;
            this.klass = klass;
            this.bundle = bundle;
        }
    }
}
