package com.Library_Mangament_System.model;


import com.Library_Mangament_System.enums.TxnStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Builder
@Entity
public class Txn {

    @Id
    private Integer id;

    private String txnId;

    private TxnStatus txnStatus;

    private Double settlementAmount;

    private Date issuedDate;

    private Date submittedDate;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Book book;
}
