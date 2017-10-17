package skuniv.ac.kr.quickpollapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class QuickPollList extends AppCompatActivity {
    private QuickPollTabsAdapter quickPollTabsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_poll_list);

        quickPollTabsAdapter = new QuickPollTabsAdapter(this, (TabHost) findViewById(android.R.id.tabhost), (ViewPager) findViewById(R.id.pager));
        quickPollTabsAdapter.selectTab(QuickPollTabsConfig.TABINDEX.FIRST);
    }
}
