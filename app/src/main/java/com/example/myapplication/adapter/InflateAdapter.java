package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.myapplication.R;

public class InflateAdapter extends BaseAdapter {
    private LayoutInflater mInflater = null;

    public InflateAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //说明：这里是测试inflate方法参数代码，不再考虑性能优化等TAG处理
        return getXmlToView(convertView, position, parent);
    }

    private View getXmlToView(View convertView, int position, ViewGroup parent) {
        // 第二个参数如果为null的话 与第三个参数就没关系了。 如果第二个参数是null的话 第二个参数想填就填 不填也行。不管填true和false 和没填都一样
        // 第二个参数如果是parent 的话 第三个参数就必须是false  否则会报错。
        // 实际开发 布局最好是ViewGroup
        View[] viewList = {
                mInflater.inflate(R.layout.textview_layout, parent, false),
                mInflater.inflate(R.layout.textview_layout_parent, parent, false),
        };

        convertView = viewList[position];

        return convertView;
    }
}