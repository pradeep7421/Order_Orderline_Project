package com.winsupply.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The {@code Data} class represents Response body
 * @author PRADEEP
 */
@Getter
@Setter
@ToString
public class Data {
    /**
     * The discountAmount takes values of type double
     */
    private Double finalDiscountAmount;
}
