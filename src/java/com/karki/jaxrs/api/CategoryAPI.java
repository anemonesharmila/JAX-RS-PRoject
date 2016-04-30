/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.JaxRs.api;

import com.karki.JaxRs.entity.Category;
import com.karki.JaxRs.service.CategoryService;
import com.karki.JaxRs.service.impl.CategoryServiceImpl;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/category")
public class CategoryAPI {

    private CategoryService CategoryService = new CategoryServiceImpl();

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Category> index() {
        return CategoryService.getAll();
    }

//    @GET
//    @Produces("text/plain")
//    public String see()
//    {
//        return "<h1>what????</h1>";
//    }
    
//    @Path("/{id}")
//    @GET
//    @Produces(value = MediaType.APPLICATION_JSON)
//    public Category id(@PathParam("id") int id)
//    {
//        return CategoryService.getById(id);
//    }
//    
//    @Path("/save")
//    @POST
//    public String save(@FormParam("name")String name,@FormParam("description")String desc,@FormParam("status")int status)
//    {
//        Category category=new Category(0, name, desc, null, (status==1)?true:false);
//        CategoryService.insert(null);
//        return "save";
//    }
}
