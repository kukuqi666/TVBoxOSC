package com.github.tvbox.osc.bean;

import java.util.List;

public class SubtitleData {

    private Boolean isNew;

    private List<SubtitleBean> subtitleList;

    private Boolean isZip;

    public Boolean getIsNew() {
        return isNew;
    }

    public List<SubtitleBean> getSubtitleList() {
        return subtitleList;
    }

    public Boolean getIsZip() {
        return isZip;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public void setSubtitleList(List<SubtitleBean> subtitle) {
        this.subtitleList = subtitle;
    }

    public void setIsZip(Boolean zip) {
        isZip = zip;
    }

    @Override
    public String toString() {
        return "SubtitleData{" +
                "isNew='" + isNew + '\'' +
                '}';
    }
}