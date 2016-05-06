package com.karki.JaxRs.entity;

import com.karki.JaxRs.entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-02T22:48:55")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Date> addedDate;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, Date> modifiedDate;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile SingularAttribute<Category, Integer> id;
    public static volatile ListAttribute<Category, Product> productList;
    public static volatile SingularAttribute<Category, Boolean> status;

}