package com.github.tvbox.osc.cache;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


/**
 *
 */

@Entity(tableName = SearchHistory.TABLE_NAME, indices = {@Index("searchKeyWords")})
public class SearchHistory {

    public static final String TABLE_NAME = "t_search";

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "searchKeyWords")
    public String searchKeyWords;
}
