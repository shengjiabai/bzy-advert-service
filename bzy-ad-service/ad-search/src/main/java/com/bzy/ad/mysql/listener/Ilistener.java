package com.bzy.ad.mysql.listener;

import com.bzy.ad.mysql.dto.BinlogRowData;

public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}
