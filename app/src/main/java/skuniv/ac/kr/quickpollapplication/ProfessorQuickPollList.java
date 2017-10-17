package skuniv.ac.kr.quickpollapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class ProfessorQuickPollList extends AppCompatActivity {
    private ProfessorQuickPollTabsAdapter professorQuickPollTabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor_quick_poll_list);


        findViewById(R.id.add_quickpoll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"퀵폴 추가 버튼",Toast.LENGTH_SHORT).show();
            }
        });
        professorQuickPollTabsAdapter = new ProfessorQuickPollTabsAdapter(this, (TabHost) findViewById(android.R.id.tabhost), (ViewPager) findViewById(R.id.pager));
        professorQuickPollTabsAdapter.selectTab(ProfessorQuickPollTabsConfig.TABINDEX.FIRST);
    }
}
