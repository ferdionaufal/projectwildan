package com.example.projectwildan;

public class ordermodel {

    String orderId;
    String orderName;
    String orderAlamat;
    Integer orderHp;
    String orderBarang;

    public ordermodel(){

    }

    public ordermodel(String orderId, String orderName, String orderAlamat, Integer orderHp, String orderBarang) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderAlamat = orderAlamat;
        this.orderHp = orderHp;
        this.orderBarang = orderBarang;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getOrderAlamat() {
        return orderAlamat;
    }

    public Integer getOrderHp() {
        return orderHp;
    }

    public String getOrderBarang() {
        return orderBarang;
    }
}
