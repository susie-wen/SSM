package com.susie.pojo;

import java.util.*;

/**
 * @author Susie-Wen
 * @version 1.0
 * @description:
 * @date 2022/7/20 15:17
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobby;
    private Map<String,String> card;
    private Set<String> games;
    private Properties info;
    private String mather;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.toString() +
                ", books=" + Arrays.toString(books) +
                ", hobby=" + hobby +
                ", card=" + card +
                ", games=" + games +
                ", info=" + info +
                ", mather='" + mather + '\'' +
                '}';
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getMather() {
        return mather;
    }

    public void setMather(String mather) {
        this.mather = mather;
    }
}
