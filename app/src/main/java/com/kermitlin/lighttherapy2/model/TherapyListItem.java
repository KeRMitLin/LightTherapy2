package com.kermitlin.lighttherapy2.model;

import com.firebase.client.ServerValue;
import com.kermitlin.lighttherapy2.utils.Constants;

import java.util.HashMap;

/**
 * Created by KeRMitLin on 2016/3/19.
 */
public class TherapyListItem {
    private String listName;
    private String comment;
    private String executeTime;

    public TherapyListItem(){
    }

    public TherapyListItem(String listName, String comment, String executeTime) {
        this.listName = listName;
        this.comment = comment;
        this.executeTime = executeTime;
    }

    public String getListName(){
        return listName;
    }

    public String getComment(){
        return comment;
    }

    public String getExecuteTime(){
        return executeTime;
    }
}
