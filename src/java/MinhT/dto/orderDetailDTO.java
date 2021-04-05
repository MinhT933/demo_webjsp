/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhT.dto;

/**
 *
 * @author MinhT
 */
public class orderDetailDTO {
   String id;
   String name;
   float totalPrice;
   String proId;
   String orderID;

    public orderDetailDTO(String id, String name, float totalPrice, String proId, String orderID) {
        this.id = id;
        this.name = name;
        this.totalPrice = totalPrice;
        this.proId = proId;
        this.orderID = orderID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
   
   
    
}
