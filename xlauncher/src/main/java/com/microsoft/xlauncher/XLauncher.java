package com.microsoft.xlauncher;

import android.view.View;

/**
 * Created by yangming on 6/6/2016.
 */
public class XLauncher extends Launcher {
    @Override
    protected boolean hasCustomContentToLeft() {
        return true;
    }

    @Override
    protected void populateCustomContentContainer() {
        View customView = getLayoutInflater().inflate(R.layout.customized_workspace_layout, null);

        CustomContentCallbacks callbacks = new CustomContentCallbacks() {

            @Override
            public void onShow(boolean fromResume) {}

            @Override
            public void onHide() {}

            @Override
            public void onScrollProgressChanged(float progress) {}

            @Override
            public boolean isScrollingAllowed() { return true; }
        };

        addToCustomContentPage(customView, callbacks, "custom view");
    }

}
