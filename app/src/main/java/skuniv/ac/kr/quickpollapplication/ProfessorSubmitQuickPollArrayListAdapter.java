package skuniv.ac.kr.quickpollapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.List;

/**
 * Created by gunyoungkim on 2017-10-18.
 */

public class ProfessorSubmitQuickPollArrayListAdapter extends ArrayAdapter<QuizData> {
    private LayoutInflater layoutInflater;
    static HashMap<QuizData,CheckBox> quizDataCheckBoxHashMap;

    public ProfessorSubmitQuickPollArrayListAdapter(@NonNull Context context) {

        super(context, R.layout.row_submit_quickpoll_list);
        quizDataCheckBoxHashMap=new HashMap<QuizData,CheckBox>();
        layoutInflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.row_submit_quickpoll_list, parent, false);
        }
        final QuizData quizData=getItem(position);
        quizDataCheckBoxHashMap.put(quizData,((CheckBox)view.findViewById(R.id.SubmitCheck)));
        ((TextView)view.findViewById(R.id.QuizTitle)).setText(quizData.getQuestion_content());
        if(quizData.getQuestion_type()==2){
            ((ImageView)view.findViewById(R.id.QuizType)).setImageResource(R.drawable.object);
        }else if(quizData.getQuestion_type()==3){
            ((ImageView)view.findViewById(R.id.QuizType)).setImageResource(R.drawable.subject);
        }else if(quizData.getQuestion_type()==4){
            ((ImageView)view.findViewById(R.id.QuizType)).setImageResource(R.drawable.ox);
        }
        return view;
    }
    public  void add(List<QuizData> list){
        if(list==null){
            return;
        }
        for(QuizData quizData:list){
            add(quizData);
        }
    }

}