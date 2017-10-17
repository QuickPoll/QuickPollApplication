package skuniv.ac.kr.quickpollapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gunyoungkim on 2017-10-18.
 */

public class ProfessorRankingArrayListAdapter extends ArrayAdapter<RankingData> {
    private LayoutInflater layoutInflater;


    public ProfessorRankingArrayListAdapter(@NonNull Context context) {
        super(context, R.layout.row_ranking_list);
        layoutInflater=LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.row_ranking_list, parent, false);
        }
        final RankingData rankingData=getItem(position);
        ((TextView)view.findViewById(R.id.Ranking_Number)).setText(rankingData.getRanking()+"");
        ((TextView)view.findViewById(R.id.Ranking_Student_Name)).setText(rankingData.getStudent_name());
        Log.d("???", (int)((rankingData.getCorrect()/(double)rankingData.getQuestion())*100)+"<-");
        ((TextView)view.findViewById(R.id.Ranking_Percent)).setText((int)((rankingData.getCorrect()/(double)rankingData.getQuestion())*100)+"%");
        ((TextView)view.findViewById(R.id.Ranking_Correct)).setText(rankingData.getCorrect()+"");
        ((TextView)view.findViewById(R.id.Ranking_Question)).setText("/ "+rankingData.getQuestion()+"");
        return view;
    }
    public  void add(List<RankingData> list){
        if(list==null){
            return;
        }
        for(RankingData rankingData:list){
            add(rankingData);
        }
    }

}