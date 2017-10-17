package skuniv.ac.kr.quickpollapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gunyoungkim on 2017-10-18.
 */

public class ProfessorSubmitQuickPollListFragment extends ListFragment {
    private ProfessorSubmitQuickPollArrayListAdapter professorSubmitQuickPollArrayListAdapter;
    List<QuizData> quizDatas;
    QuizData quizData;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        professorSubmitQuickPollArrayListAdapter = new ProfessorSubmitQuickPollArrayListAdapter(getActivity());
        setListAdapter(professorSubmitQuickPollArrayListAdapter);
        quizDatas=new ArrayList<QuizData>();
        quizData=new QuizData();
        quizData.setQuestion_date("08/06");
        quizData.setQuestion_content("물리계층의 전송단위는?");
        quizData.setQuestion_type(1);
        quizDatas.add(quizData);
        quizData=new QuizData();
        quizData.setQuestion_date("08/06");
        quizData.setQuestion_content("이과목을 통해 배우고 싶은것은?");
        quizData.setQuestion_type(2);
        quizDatas.add(quizData);
        quizData=new QuizData();
        quizData.setQuestion_date("08/06");
        quizData.setQuestion_content("TransPort계층의 전송단위는?");
        quizData.setQuestion_type(3);
        quizDatas.add(quizData);
        return inflater.inflate(R.layout.submit_quickpoll_list_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView lv = ((ListView) getView().findViewById(android.R.id.list));
        professorSubmitQuickPollArrayListAdapter.add(quizDatas);
        Button send_btn=(Button)getView().findViewById(R.id.send_quickpoll_button);
        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(QuizData quizData:ProfessorSubmitQuickPollArrayListAdapter.quizDataCheckBoxHashMap.keySet()){
                    if(ProfessorSubmitQuickPollArrayListAdapter.quizDataCheckBoxHashMap.get(quizData).isChecked()==true){
                        System.out.println(quizData.getQuestion_content());
                    }
                }
            }
        });
        // new FatchQuizDataListAsyncTask().execute();
    }

    public class FatchQuizDataListAsyncTask extends SafeAsyncTask<List<QuizData>> {

        @Override
        public List<QuizData> call() throws Exception {
            List<QuizData> QuizDatas = new QuizDataProvider().FatchNurseList();
            return QuizDatas;
        }

        @Override
        protected void onException(Exception e) throws RuntimeException {
            super.onException(e);
            Log.e("FatchUserListAsyncTask", "arror" + e);
        }

        @Override
        protected void onSuccess(List<QuizData> QuizDatas) throws Exception {
            super.onSuccess(QuizDatas);
            System.out.println(QuizDatas);
            professorSubmitQuickPollArrayListAdapter.add(QuizDatas);

        }
    }
}