package skuniv.ac.kr.quickpollapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by gunyoungkim on 2017-10-17.
 */

public class QuizArrayListAdapter extends ArrayAdapter<QuizData> {
    private LayoutInflater layoutInflater;


    public QuizArrayListAdapter(@NonNull Context context) {
        super(context, R.layout.row_quiz_list);
        layoutInflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.row_quiz_list, parent, false);
        }
        final QuizData quizData=getItem(position);

        ((TextView)view.findViewById(R.id.QuizDay)).setText(quizData.getQuestion_date());
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
