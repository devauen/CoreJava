package com.proartz.Chapter2.Exercise14;

public class NetworkDemo {
    public static void main(String[] args) {
        Network myFace = new Network();
        Network tooter = new Network();
        Network.Member fred = myFace.enroll("Fred");
        Network.Member wilma = myFace.new Member("Wilma");
            // Obiekt, ale nie dopisany
            // Aby tego unikn�� zadeklaruj konstruktor jako prywatny
        fred.addFriend(wilma);

        Network.Member barney = tooter.enroll("Barney");
        fred.addFriend(barney);
        System.out.println(myFace);
            // Je�li nie powinno by� mo��iwo�ci dodania kontaktu
            // nale��cego do innej sieci wywo�aj belongsTo
        System.out.println(barney.belongsTo(myFace));
    }
}
