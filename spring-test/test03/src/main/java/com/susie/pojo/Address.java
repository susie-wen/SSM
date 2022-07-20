package com.susie.pojo;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 15:18
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
