package com.github.tvbox.osc.cache;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SearchDao {

    @Insert
    void insert(SearchHistory trackData);

    @Delete
    void delete(SearchHistory trackData);

    @Query("SELECT * FROM T_SEARCH")
    List<SearchHistory> getAll();

    @Query("SELECT * FROM T_SEARCH WHERE searchKeyWords=:keyword")
    List<SearchHistory> getByKeywords(String keyword);

}
