/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thovpp.bookstore.dto;

import java.io.Serializable;
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
// Serializable là 1 interface đặc biệt, không có hàm nào
// ta cần phải ta cần phải viết code cho nó 
// nó dùng để đánh dấu class có điều đặc biệt nào đó 
// dùng để báo hiệu cho JVM biết lúc nào đó sẻ phải chẻ cái object book này thành các luồng 
//các dòng tuần tự để đem xuống db và không lấy những hàm đem xuống db 
//serial...từng dãy từng dãy
public class Book implements Serializable{

    private String isbn;        //mã số cuốn sách 
    private String title;       //tựa đề cuốn sách 
    private String author;      //tác giả cuốn sách
    private int edition;        //lần xuất bản 
    private int publishedYear;  //năm xuất bản

}
