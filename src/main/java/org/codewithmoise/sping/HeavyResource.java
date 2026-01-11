package org.codewithmoise.sping;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy // means bean initializes when in need
public class HeavyResource {
    public HeavyResource(){
        System.out.println("Heavy resources started");
    }
}
