package com.zwl.performanceoptimize;

import android.content.Context;

/**
 * Created by weilongzhang on 16/11/2.
 */
public class CommUtil {

    private static CommUtil instance;
    private Context context;

    private CommUtil(Context context) {
        this.context = context;
    }

    public static CommUtil getInstance(Context context) {
        if (instance == null) {
            instance = new CommUtil(context);
        }
        return instance;
    }

}
