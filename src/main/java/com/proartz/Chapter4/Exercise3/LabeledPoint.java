package com.proartz.Chapter4.Exercise3;

import com.proartz.Chapter4.Exercise1.Point;

public class LabeledPoint extends Point {

    private String label;

    public LabeledPoint(String label, Point point) {
        /*
        this.x = point.x; błąd
        this.y = point.y; błąd

        modyfikator protected pozwala klasom podrzędnym na dostęp do pól z klasy nadrzędnej,
        jedynie w obrębie tej samej klasy np. LabeledPoint do oddziediczonych po Point pól x i y.
        Nie pozwala jednak klasie LabeledPoint na dostęp do pól instancji klasy Point.
        Warunkiem koniecznym jest jednak to, że klasy LabeledPoint i Point muszą być w innych pakietach.
         */
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
