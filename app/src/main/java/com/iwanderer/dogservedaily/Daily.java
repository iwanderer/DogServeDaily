package com.iwanderer.dogservedaily;

import java.util.Date;
import java.util.UUID;

/**
 * Created by leslie on 15-10-24.
 */
public class Daily {
    private UUID mUUID;
    private Date mDate;
    private String mText;

    public Daily() {

    }

    public UUID getUUID() {
        return mUUID;
    }

    public void setUUID(UUID UUID) {
        mUUID = UUID;
    }

    public Date getDate() {
        return mDate;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }
}
