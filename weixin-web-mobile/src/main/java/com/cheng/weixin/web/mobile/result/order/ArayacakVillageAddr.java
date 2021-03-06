package com.cheng.weixin.web.mobile.result.order;

/**
 * Desc:
 * Author: hp
 * Date: 2016/11/2
 */
public class ArayacakVillageAddr {
    private String addrId;
    private String address;
    private String distance;

    public ArayacakVillageAddr(String addrId, String address, String distance) {
        this.addrId = addrId;
        this.address = address;
        this.distance = distance;
    }

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
