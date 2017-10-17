package skuniv.ac.kr.quickpollapplication.UI;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import skuniv.ac.kr.quickpollapplication.R;

/**
 * Created by oopsla on 2017-10-18.
 */

public class CourseAdapter extends BaseAdapter {

    private ArrayList<CourseItem> mItems = new ArrayList<>();

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public CourseItem getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Context context = parent.getContext();

        /* 'listview_custom' Layout을 inflate하여 convertView 참조 획득 */
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.course_list_item_professor, parent, false);
        }
        ImageView creditImg = (ImageView) convertView.findViewById(R.id.credit) ;
        ImageView clickBtn = (ImageView) convertView.findViewById(R.id.clickBtn) ;
        TextView courseName = (TextView) convertView.findViewById(R.id.courseName) ;
        TextView date = (TextView) convertView.findViewById(R.id.date) ;

        /* 각 리스트에 뿌려줄 아이템을 받아오는데 mMyItem 재활용 */
        CourseItem courseItem = getItem(position);

        creditImg.setImageDrawable(courseItem.getCredit());
        clickBtn.setImageDrawable(courseItem.getSendBtn());
        courseName.setText(courseItem.getCourseName());
        date.setText(courseItem.getDate());

        /* (위젯에 대한 이벤트리스너를 지정하고 싶다면 여기에 작성하면된다..)  */

        return convertView;
    }

    /* 아이템 데이터 추가를 위한 함수. 자신이 원하는대로 작성 */
    public void addItem(Drawable credit, Drawable clickBtn, String courseName, String date) {

        CourseItem courseItem = new CourseItem();

        courseItem.setCredit(credit);
        courseItem.setSendBtn(clickBtn);
        courseItem.setCourseName(courseName);
        courseItem.setDate(date);
        mItems.add(courseItem);

    }

}
