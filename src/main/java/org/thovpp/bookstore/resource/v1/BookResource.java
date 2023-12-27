/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thovpp.bookstore.resource.v1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.thovpp.bookstore.dto.Book;

/**
 *
 * @author khuye
 */
@Path("v1/books")
public class BookResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getABook() {
        // Gọi DAO lên trả về 1 hoặc nhiều cuốn sách
        return new Book("978-604-1-11902-4", "Nicholas Flamel là một nhà giả kim, sinh vào năm 1330, nhờ học được phép thuật bất tử từ cuốn sách Codex của pháp sư Abraham, ông sống đến đầu thế kỷ XXI và gắn liền định mệnh của mình với sự tồn tại của Codex. ");
    }
}
