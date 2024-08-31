package org.example.user;

import jakarta.annotation.PostConstruct;
import org.example.contract.Bakery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {

    private Bakery bakery;

    @Autowired
    @Qualifier("")
    public void setFood(Bakery bakery) {
        this.bakery = bakery;
    }

    @PostConstruct
    public void init(){
        bakery.consumption();
    }

}
