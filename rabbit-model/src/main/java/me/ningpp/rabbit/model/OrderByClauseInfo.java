package me.ningpp.rabbit.model;

import java.util.List;

public class OrderByClauseInfo extends CommentElement {

    private String orderByKeyword;

    public String getOrderByKeyword() {
        return orderByKeyword;
    }

    public void setOrderByKeyword(String orderByKeyword) {
        this.orderByKeyword = orderByKeyword;
    }

    private List<OrderingInfo> orderings;

    public List<OrderingInfo> getOrderings() {
        return orderings;
    }

    public void setOrderings(List<OrderingInfo> orderings) {
        this.orderings = orderings;
    }
}
