package com.material.androidwysiwigeditor.Utilities;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.material.androidwysiwigeditor.FragmentPreview;
import com.material.androidwysiwigeditor.HTMLRenderedFragment;
import com.material.androidwysiwigeditor.SerializedFragment;

public class RendererPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    final String content;
    private String tabTitles[] = new String[] { "Rendered", "Serialized", "HTML" };
    private Context context;

    public RendererPagerAdapter(FragmentManager fm, Context context, String content) {
        super(fm);
        this.context = context;
        this.content= content;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {

            return HTMLRenderedFragment.newInstance(content);
        }
        else if(position==1){
            return SerializedFragment.newInstance(content);
        }else{
            return FragmentPreview.newInstance(content);
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
