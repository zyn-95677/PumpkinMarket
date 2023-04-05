package com.zyn.pumpkinmarket.filter;

import com.zyn.pumpkinmarket.utils.Resp;

/**
 * 全局异常类
 *
 * @Author zyn
 * @Date 2022/6/19 13:03
 */
public class GlobalException extends RuntimeException {

    private Resp resp;

    public GlobalException(Resp resp) {
        super(resp.toString());
        this.resp = resp;
    }

    public Resp getResp() {
        return resp;
    }
}
