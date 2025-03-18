package com.cruds.POO;

public class bikeDemo {
    public static void main(String[] args) {
        //create two diferents
        //biciclete objects

        bike bikeone = new bike();
        bike biketwo = new bike();
        MountainBike m = new MountainBike();

        //Invoke methodos
        //those object
        bikeone.ano = 2025;
        bikeone.color = "red";
        bikeone.name = "bugatti";
        bikeone.velocidadeMaxi(350);

        biketwo.name = "Ram";
        biketwo.color = " black";
        biketwo.ano = 2020;
        biketwo.velocidadeMaxi(200);



    }
}
