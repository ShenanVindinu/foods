package org.example.beans;

import org.example.contract.Bakery;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("")
public class ChickenRoll implements Bakery {
    @Override
    public void consumption() {

    }
}
