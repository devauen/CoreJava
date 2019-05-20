package com.proartz.Chapter6.Exercise14;

import java.util.ArrayList;
import static com.proartz.Chapter6.Exercise14.AutoCloseables.*;

public class App {

    public static void main(String[] args) {

        ArrayList<SoCloseable> elements = new ArrayList<>();
        for(int i = 4; i < 10; i++) {
            elements.add(new ThrowingCloseable());
        }
        for(int i = 5; i < 10; i++) {
            elements.add(new SoCloseable());
        }

        try{
            closeAll(elements);
        } catch (Exception ex) {
            showAllCauses(ex);
        }

        for(SoCloseable element : elements)
            System.out.println("Close: " + element.isClosed());
    }

}
