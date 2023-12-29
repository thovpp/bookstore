/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thovpp.bookstore.resource.v2;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.thovpp.bookstore.dto.Book;

/**
 *
 * @author khuye
 */
@Path("v2/books")
public class BookResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getABook(){
    return new Book("8935270703721", "Khuyến Học", "Fukuzawa Yukichi", 10, 1872);
    }
}
