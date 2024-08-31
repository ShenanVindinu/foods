package org.example.beans;

import org.example.contract.Bakery;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("primary")
public class FishBun implements Bakery {
    @Override
    public void consumption() {

    }
}
