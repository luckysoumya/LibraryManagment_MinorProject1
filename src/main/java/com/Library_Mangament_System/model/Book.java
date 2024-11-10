package com.Library_Mangament_System.model;


import com.Library_Mangament_System.enums.BookType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder
@Entity
public class Book extends TimeStamps{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String title;

    @Enumerated
    private BookType booktype;

    @Column(nullable = false)
    private Double securityMoney;

    @ManyToOne
    @JoinColumn
    private User user;


    @ManyToOne
    @JoinColumn
    private Author author;

    @OneToMany
    private List<Txn> txnList;



}
