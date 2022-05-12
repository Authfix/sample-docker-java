package fr.acl.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static javax.persistence.GenerationType.IDENTITY;

@Entity()
public class Product {
    
    public Product(){        
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    public Integer getId(){
        return this.id;
    }
}
