package com.apabi.producer.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuyutong on 2018/9/10.
 */
public class RespData implements Serializable {
    private static String SUCCESS = "SUCCESS";
    private static String ERROR = "ERROR";
    private String status;
    private String cause;
    private Object data;

    public static RespData error(String cause) {
        RespData respData = new RespData();
        respData.status = ERROR;
        respData.cause = cause;
        return respData;
    }

    public static RespData error(String status, String cause) {
        RespData respData = new RespData();
        respData.status = status;
        respData.cause = cause;
        return respData;
    }

    public static RespData success(Object data) {
        RespData respData = new RespData();
        respData.status = SUCCESS;
        respData.data = data;
        return respData;
    }
    public static RespData success(String status, Object data) {
        RespData respData = new RespData();
        respData.status = status;
        respData.data = data;
        return respData;
    }

    public static RespData success(Long total, List<?> rows) {
        RespData respData = new RespData();
        respData.status = SUCCESS;
        respData.data = new PageResult(total, rows);
        return respData;
    }
    public static RespData success(String status, Long total, List<?> rows) {
        RespData respData = new RespData();
        respData.status = status;
        respData.data = new PageResult(total, rows);
        return respData;
    }


    public String getStatus() {
        return status;
    }

    public String getCause() {
        return cause;
    }

    public Object getData() {
        return data;
    }

    private static class PageResult implements Serializable {
        private Long total;
        private List<?> rows;

        public PageResult(Long total, List<?> rows) {
            this.total = total;
            this.rows = rows;
        }

        public Long getTotal() {
            return total;
        }


        public List<?> getRows() {
            return rows;
        }
    }
}
