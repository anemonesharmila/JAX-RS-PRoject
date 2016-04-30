package com.karki.JaxRs.entity;

import com.karki.JaxRs.entity.Category;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-30T22:24:45")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, BigDecimal> sellingPrice;
    public static volatile SingularAttribute<Product, Integer> quantity;
    public static volatile SingularAttribute<Product, Date> addedDate;
    public static volatile SingularAttribute<Product, BigDecimal> costPrice;
    public static volatile SingularAttribute<Product, Date> modifiedDate;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, String> title;
    public static volatile SingularAttribute<Product, Category> category;
    public static volatile SingularAttribute<Product, Short> status;

}