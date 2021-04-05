/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhT.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author MinhT
 */
public class OrderDto {
    String id;
    Date date;
    float price;
    String name;
    String userID;
    int status;

    public OrderDto(String id, Date date, float price, String name, String userID, int status) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.name = name;
        this.userID = userID;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

 
}
