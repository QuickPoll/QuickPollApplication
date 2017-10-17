package skuniv.ac.kr.quickpollapplication;

import android.os.Bundle;


/**
 * Created by gunyoungkim on 2017-09-07.
 */

public class ProfessorQuickPollTabsConfig {
    public static ProfessorQuickPollTabsConfig.TabInfo[] TABINFOS = {
            new ProfessorQuickPollTabsConfig.TabInfo( "사용자", R.drawable.no_selected_question_image, R.drawable.questionimage, QuizListFragment.class, null),
            new ProfessorQuickPollTabsConfig.TabInfo( "알람1", R.drawable.ranking_image, R.drawable.select_ranking_image, ProfessorRankingListFragment.class, null),
            new ProfessorQuickPollTabsConfig.TabInfo( "알람1", R.drawable.question_check, R.drawable.question_uncheck, ProfessorSubmitQuickPollListFragment.class, null)
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

    public static final TabInfo TABINFO(int index ) {
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
