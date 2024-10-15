package com.rubeshop.app.orderItem;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rubeshop.app.order.Order;
import com.rubeshop.app.product.Product;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonIgnore
    @ManyToOne
    private Order order;

    @ManyToOne
    private Product product;

    private String size;

    private int qty;

    private Integer mrpPrice;

    private Integer sellPrice;

    private Long userId;
}
