package com.example.android.alextourguide;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 *  {@link Landmark} carries all the information of the site
 */

public class Landmark {
    private Resources resources;
    private String mName;
    private String mDescription;
    private int mImageId;


    /**
     * Creates a new object for {@link Landmark}
     *
     * @param mName is the name of the site
     * @param mDescription is the details of the site
     * @param mImageId the image displayed for the user
     */
    public Landmark(String mName, String mDescription, int mImageId) {

        this.mName = mName;
        this.mDescription = mDescription;
        this.mImageId = mImageId;
    }

    /**
     *
     * @return the name of the site
     */

    public String getmName() {
        return mName;
    }

    /**
     *
     * @return description of the site
     */
    public String getmDescription() {
        return mDescription;
    }

    /**
     *
     * @return the bitmap of the image for the site
     */

    public Bitmap getBitmapImage() {
        Bitmap bitmap  = BitmapFactory.decodeResource(resources,mImageId);
        bitmap = Bitmap.createScaledBitmap(bitmap,85,150,true);
        return bitmap;
    }
}
