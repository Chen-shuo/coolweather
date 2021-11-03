package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author chenshuo
 * @Type Province
 * @Desc
 * @date 2021/11/3 14:08
 */
public class Province extends DataSupport {
    private int id;
    private String  provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2021/11/3 chenshuo create
 */