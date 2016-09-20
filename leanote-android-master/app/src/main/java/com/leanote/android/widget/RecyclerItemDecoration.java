package com.leanote.android.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by binnchx on 10/18/15.
 */
public class RecyclerItemDecoration extends RecyclerView.ItemDecoration {
    private final int mSpacingHorizontal;
    private final int mSpacingVertical;

    public RecyclerItemDecoration(int spacingHorizontal, int spacingVertical) {
        super();
        mSpacingHorizontal = spacingHorizontal;
        mSpacingVertical = spacingVertical;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.set(mSpacingHorizontal, // left
                0,                      // top
                mSpacingHorizontal,     // right
                mSpacingVertical);      // bottom
    }
}