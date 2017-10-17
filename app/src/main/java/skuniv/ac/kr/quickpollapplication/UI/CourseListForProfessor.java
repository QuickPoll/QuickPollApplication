package skuniv.ac.kr.quickpollapplication.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import skuniv.ac.kr.quickpollapplication.Activity_Login;
import skuniv.ac.kr.quickpollapplication.ProfessorQuickPollList;
import skuniv.ac.kr.quickpollapplication.R;

/**
 * Created by oopsla on 2017-10-17.
 */

public class CourseListForProfessor extends AppCompatActivity {

    private ListView mListView;
    private CourseAdapter courseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_list_professor);

        /* 위젯과 멤버변수 참조 획득 */
        mListView = (ListView)findViewById(R.id.listView);

        /* 아이템 추가 및 어댑터 등록 */
        dataSetting();
        mListView.setOnItemClickListener(onClickListItem);
    }
    // 아이템 터치 이벤트
    private AdapterView.OnItemClickListener onClickListItem = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            // 이벤트 발생 시 해당 아이템 위치의 텍스트를 출력
            Intent intent = new Intent(CourseListForProfessor.this, ProfessorQuickPollList.class);
            startActivity(intent);
            finish();
//            Toast.makeText(CourseListForProfessor.this, courseAdapter.getItem(arg2).getCourseName(), Toast.LENGTH_SHORT).show();
        }
    };
    private void dataSetting(){

        courseAdapter = new CourseAdapter();

        courseAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.credit), ContextCompat.getDrawable(getApplicationContext(), R.drawable.enterbox),"초고속 통신망", "화21,22");
        courseAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.credit), ContextCompat.getDrawable(getApplicationContext(), R.drawable.enterbox),"캡스톤설계2", "수25,26");
        courseAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.credit), ContextCompat.getDrawable(getApplicationContext(), R.drawable.enterbox),"네트워크 프로그래밍1", "월21,22");
        courseAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.credit), ContextCompat.getDrawable(getApplicationContext(), R.drawable.enterbox),"네트워크 프로그래밍2", "수21,22");


        /* 리스트뷰에 어댑터 등록 */
        mListView.setAdapter(courseAdapter);
    }

}
