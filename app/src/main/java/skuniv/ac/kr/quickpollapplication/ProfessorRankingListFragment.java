package skuniv.ac.kr.quickpollapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gunyoungkim on 2017-10-18.
 */

public class ProfessorRankingListFragment extends ListFragment {
    private ProfessorRankingArrayListAdapter professorRankingArrayListAdapter;
    List<RankingData> rankingDatas;
    RankingData rankingData;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        professorRankingArrayListAdapter=new ProfessorRankingArrayListAdapter(getActivity());
        setListAdapter(professorRankingArrayListAdapter);

        rankingDatas=new ArrayList<RankingData>();
        rankingData=new RankingData();
        rankingData.setRanking(1);
        rankingData.setStudent_name("김문수");
        rankingData.setQuestion(28);
        rankingData.setCorrect(25);
        rankingDatas.add(rankingData);
        rankingData=new RankingData();
        rankingData.setRanking(2);
        rankingData.setStudent_name("김주현");
        rankingData.setQuestion(28);
        rankingData.setCorrect(24);
        rankingDatas.add(rankingData);
        rankingData=new RankingData();
        rankingData.setRanking(3);
        rankingData.setStudent_name("이규영");
        rankingData.setQuestion(28);
        rankingData.setCorrect(22);
        rankingDatas.add(rankingData);
        return inflater.inflate(R.layout.ranking_list_fragment,container,false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView lv=((ListView)getView().findViewById(android.R.id.list));
        professorRankingArrayListAdapter.add(rankingDatas);
        // new FatchQuizDataListAsyncTask().execute();
    }

    public class FatchQuizDataListAsyncTask extends SafeAsyncTask<List<RankingData>> {

        @Override
        public List<RankingData> call() throws Exception {
            List<RankingData> RankingDatas=new RankingDataProvider().FatchNurseList();
            return RankingDatas;
        }
        @Override
        protected void onException(Exception e) throws RuntimeException {
            super.onException(e);
            Log.e("FatchUserListAsyncTask","arror"+e);
        }

        @Override
        protected void onSuccess(List<RankingData> RankingDatas) throws Exception {
            super.onSuccess(RankingDatas);
            System.out.println(RankingDatas);
            professorRankingArrayListAdapter.add(RankingDatas);

        }
    }

}