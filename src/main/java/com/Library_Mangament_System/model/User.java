package com.Library_Mangament_System.model;


import com.Library_Mangament_System.enums.UserStatus;
import com.Library_Mangament_System.enums.UserType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class User extends TimeStamps{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length =50)
    private String name;

    @Column(unique = true,length = 50)
    private String phoneno;


    @Column(nullable = false,unique = true,length = 50 )
    private String email;

    private String address;


    @Enumerated
    private UserStatus userStatus;
    @Enumerated
    private UserType userType;

    @OneToMany(mappedBy = "user")
    private List<Book> bookList;


    @OneToMany(mappedBy = "user")
    private List<Txn> txnList;


}
