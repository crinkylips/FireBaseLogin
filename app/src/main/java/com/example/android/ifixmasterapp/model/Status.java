package com.example.android.ifixmasterapp.model;

/**
 * Created by hIVE9 on 20/07/2017.
 */

public class Status {

    private String statusId;
    private String statusName;
    private int count;

    public Status(){

    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
