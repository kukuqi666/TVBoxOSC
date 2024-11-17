package com.github.tvbox.osc.data;

import com.github.tvbox.osc.cache.SearchHistory;

import java.util.ArrayList;

public class SearchPresenter {

    public boolean keywordsExist(String keyword) {
        return DbHelper.checkKeyWords(keyword);
    }

    public ArrayList<SearchHistory> getSearchHistory() {
        return DbHelper.getAllHistory();
    }

    public void addKeyWordsTodb(String keyword) {
        DbHelper.addKeywords(keyword);
    }

    public void clearSearchHistory() {
        DbHelper.clearKeywords();
    }
}
