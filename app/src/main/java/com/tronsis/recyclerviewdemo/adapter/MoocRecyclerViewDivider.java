package com.tronsis.recyclerviewdemo.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * @author scofield@tronsis.com
 * @date 2016/7/10 10:15
 */
public class MoocRecyclerViewDivider extends RecyclerView.ItemDecoration {

    //默认分割条Drawable资源的ID
    private static final int[] ATTRS = {android.R.attr.listDivider};

    //分割条Drawable对象
    private Drawable mDivider;


    public MoocRecyclerViewDivider(Context context) {
        TypedArray typedArray = context.obtainStyledAttributes(ATTRS);
        //系统提供的分割条
        mDivider = typedArray.getDrawable(0);

        //回收TypedArray占用的空间
        typedArray.recycle();
    }


    /**
     * 绘制所有列表件的分割条
     *
     * @param c
     * @param parent
     * @param state
     */
    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
        //获取列表项距离左边源的距离
        int left = parent.getPaddingLeft();

        //获取列表项距离右边源的距离
        int right = parent.getWidth() - parent.getPaddingRight();

        //获取列表项的总数
        int childCount = parent.getChildCount();

        //绘制所有列表项的分割线
        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);
            //获取当前列表项的布局参数信息
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();
            //计算分割条左上角的纵坐标
            int top = child.getBottom() + params.bottomMargin;
            //计算分割条右下角的纵坐标
            int bottom = top + mDivider.getIntrinsicHeight();

            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }


    }
}
