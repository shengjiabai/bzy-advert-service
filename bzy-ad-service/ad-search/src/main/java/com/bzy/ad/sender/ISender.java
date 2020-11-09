package com.bzy.ad.sender;


import com.bzy.ad.mysql.dto.MySqlRowData;

public interface ISender {

    void sender(MySqlRowData rowData);
}
