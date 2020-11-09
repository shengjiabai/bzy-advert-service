package com.bzy.ad.mysql.dto;

import com.github.shyiko.mysql.binlog.event.EventType;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 *   UpdateRowsEventData{tableId=85, includedColumnsBeforeUpdate={0, 1, 2},
 * // includedColumns={0, 1, 2}, rows=[
 * //        {before=[10, 10, 宝马], after=[10, 11, 宝马]}
 */
@Data
public class BinlogRowData {

    private TableTemplate table;

    private EventType eventType;

    private List<Map<String, String>> after;

    private List<Map<String, String>> before;
}
