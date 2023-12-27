/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.thovpp.bookstore.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author khuye
 */
// quy ước endpoint
// đây là điểm chạm đầu tiên khi vào api
@ApplicationPath("api") //     /api đến class này phục vụ 
// api/books trả về các cuốn sách thô JSON
public class BookApplication extends ResourceConfig {

    public BookApplication() {
        packages("org.thovpp.bookstore.resource"); // những class trong 2 package này 
                                                   // là v1 và v2 sẻ phục vụ JSON cho ai đó cần
    }

}
