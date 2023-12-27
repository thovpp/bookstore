/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thovpp.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author khuye
 */
//contructor/setter/getter by lombok
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {

    private String isbn;
    private String title;
}
