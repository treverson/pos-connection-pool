/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author ranjith-suranga
 */
@Embeddable
public class ItemDetail_PK implements Serializable {
    
    private String orderId;
    private String itemCode; 

    public ItemDetail_PK() {
    }

    public ItemDetail_PK(String orderId, String itemCode) {
        this.orderId = orderId;
        this.itemCode = itemCode;
    }
    

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
}
