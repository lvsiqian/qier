package com.example.x_b;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class BooleanBean {
    @Id
    private Long id;
    private boolean isCheckd;
    @Generated(hash = 1872711457)
    public BooleanBean(Long id, boolean isCheckd) {
        this.id = id;
        this.isCheckd = isCheckd;
    }
    @Generated(hash = 1704997175)
    public BooleanBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public boolean getIsCheckd() {
        return this.isCheckd;
    }
    public void setIsCheckd(boolean isCheckd) {
        this.isCheckd = isCheckd;
    }
}
