/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thovpp.bookstore.resource.v1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import org.thovpp.bookstore.dto.Book;

/**
 *
 * @author khuye
 */
@Path("v1/books")
public class BookResource {

    private List<Book> books = new ArrayList<>();

    public BookResource() {
        books.add(new Book("978-604-1-11902-4",
                "Nicholas Flamel là một nhà giả kim, sinh vào năm 1330, nhờ học được phép thuật bất tử từ cuốn sách Codex của pháp sư Abraham, ông sống đến đầu thế kỷ XXI và gắn liền định mệnh của mình với sự tồn tại của Codex. ",
                " Paulo Coelho.", 10, 1988));
        books.add(new Book("1", "One small message returned fron API my own first API"
                + ", one giant leap for IT knowledge/career",
                "Apollo 11-Neli Armstrong",
                1, 1969));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getBooks() {
        // Gọi DAO lên trả về 1 hoặc nhiều cuốn sách
        return books;
    }

    //đưa tham số trên url để map vào biến isbn
    @GET
    //api/v2/books/ma-so-sach-can-tim
    //tham số đưa trực tiếp vào đường dẫn api
    //api/v2/books/2
    @Path("{masach}")   //url sẻ nhận masach là các giá trị thay đổi
    // đường dẫn url linh hoạt tuy masach gõ vào
    @Produces(MediaType.APPLICATION_JSON)
    public Book getOne(@PathParam("masach") String isbn) {
        for (Book o : books) {
            if (o.getIsbn().equalsIgnoreCase(isbn)) {
                return o;
            }
        }
        return null;
    }

}
