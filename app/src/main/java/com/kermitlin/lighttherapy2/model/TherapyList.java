package com.kermitlin.lighttherapy2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.firebase.client.ServerValue;
import com.kermitlin.lighttherapy2.utils.Constants;

import java.util.HashMap;

/**
 * Created by KeRMitLin on 2016/3/19.
 */
public class TherapyList {
    private String listName;
    private String comment;
    private HashMap<String, Object> timestampCreated;

    public TherapyList(){
    }

    public TherapyList(String listName, String comment, HashMap<String, Object> timestampCreated) {
        this.listName = listName;
        this.comment = comment;
        this.timestampCreated = timestampCreated;
        HashMap<String, Object> timestampCreatedObj = new HashMap<String, Object>();
        timestampCreatedObj.put(Constants.FIREBASE_PROPERTY_TIMESTAMP, ServerValue.TIMESTAMP);
        this.timestampCreated = timestampCreatedObj;
    }

    public String getListName(){
        return listName;
    }

    public String getComment(){
        return comment;
    }

    public HashMap<String, Object> getTimestampCreated() {
        return timestampCreated;
    }

    @JsonIgnore
    public long getTimestampCreatedLong() {
        return (long) timestampCreated.get(Constants.FIREBASE_PROPERTY_TIMESTAMP);
    }
}
