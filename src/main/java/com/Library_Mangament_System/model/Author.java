package com.Library_Mangament_System.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Author extends TimeStamps{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String name;

    @Column(nullable = false, unique = true,length=50)
    private String mail;


    @OneToMany(mappedBy = "author")
    private List<Book> bookList;




}
