/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thovpp.bookstore.resource.v3;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import org.thovpp.bookstore.dao.BookDAO;
import org.thovpp.bookstore.dto.Book;

/**
 *
 * @author khuye
 */
@Path("v3/books")
public class BookResource {

    private BookDAO dao = BookDAO.getInstance();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll() {
        return dao.getAll();
    }

    @GET
    @Path("{masach}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getOne(@PathParam("masach") String isbn) {
        return dao.getOne(isbn);
    }
}
