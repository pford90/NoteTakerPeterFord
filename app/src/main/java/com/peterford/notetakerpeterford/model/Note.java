package com.peterford.notetakerpeterford.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Peter on 2/7/2018.
 */

public class Note {

    private String mTitle;
    private String mContent;
    private long mDate;

    public Note(String title, String content) {
        setTitle(title);
        setContent(content);
        mDate = new Date().getTime();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public long getDate() {
        return mDate;
    }

    public void setDate(long date) {
        mDate = date;
    }

    public String getDateString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("Month DD YYYY HH24:mi");
        return dateFormat.format(new Date(mDate));
    }

}
