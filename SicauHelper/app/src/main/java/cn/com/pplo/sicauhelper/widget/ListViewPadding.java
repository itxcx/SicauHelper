package cn.com.pplo.sicauhelper.widget;

import android.content.Context;

import android.widget.AbsListView;
import android.widget.TextView;

/**
 * Created by winson on 2014/9/27.
 */
public class ListViewPadding {
    public static TextView getListViewPadding(Context context){
        TextView tv = new TextView(context);
        tv.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, 1));
        return tv;
    }
}
