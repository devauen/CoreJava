package com.proartz.Chapter6.Exercise14;

import java.util.ArrayList;
import static com.proartz.Chapter6.Exercise14.AutoCloseables.*;

public class App {

    public static void main(String[] args) {

        ArrayList<SoCloseable> elements = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            elements.add(new ThrowingCloseable());
            elements.add(new SoCloseable());
        }

        try{
            closeAll(elements);
        } catch (RuntimeException ex) {
            showAllCauses(ex);
        }

        for(SoCloseable element : elements)
            System.out.println("Close: " + element.isClosed());
    }

}
