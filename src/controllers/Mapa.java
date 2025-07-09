package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){
        System.out.println("----runHasMap----");
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println();
        System.out.println(mapa.keySet());

        for (String c : mapa.keySet()) {
            System.out.println(mapa.get(c));
        }
        System.out.println(mapa.get("001"));
        System.out.println(mapa.get("005"));
    }

    public void runLinkedHashMap(){
        System.out.println("----runLinkedHasMap----");
        Map<Integer, String> mapa2 = new LinkedHashMap<>();
        mapa2.put(1, "Pedro");
        mapa2.put(2, "Juan");
        mapa2.put(3, "Marcelo");
        mapa2.put(4, "Roger");
        mapa2.put(5, "Milton");

        System.out.println(mapa2);
        System.out.println();
        System.out.println(mapa2.keySet());

        for (Integer c2 : mapa2.keySet()) {
            System.out.println(mapa2.get(c2));
        }

        System.out.println(mapa2.get(1));
        System.out.println(mapa2.get(6));
    }

    public void runTreeMap(){
        System.out.println("----runTreeMap----");
        Map<Integer, String> items = new TreeMap<>();
        items.put(3, "Carro");
        items.put(6, "bicicleta");
        items.put(1, "moto");

        System.out.println(items);
        System.out.println();
        System.out.println(items.keySet());
    }
    
    public void runHashMapObj(){
        System.out.println("----runHasMapObj----");
        Map<Empleado, Integer> empleados = new HashMap();
        empleados.put(new Empleado(1, "Juan", "Dev"),1200);
        empleados.put(new Empleado(2, "Juan", "Dev"),1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"),2000);
        empleados.put(new Empleado(1, "Juan", "Dev"),2500);
        empleados.put(new Empleado(1, "Diego", "Dev"),3000);

        System.out.println(empleados);
        System.out.println();
        System.out.println(empleados.keySet());

    }

    public void runTreeMapObj(){
        System.out.println("----runTreeMapObj----");
            Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"),1200);
        empleados.put(new Empleado(2, "Juan", "Dev"),1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"),2000);
        empleados.put(new Empleado(1, "Diego", "Dev"),1200);
        empleados.put(new Empleado(1, "Juan", "Senior"),3000);

        System.out.println(empleados);
        System.out.println();
        System.out.println(empleados.keySet());

    }
}
