package controllers;

import models.Empleado;

public class EmpleadoController{
    private EmpleadoDAO empleadoDAO;

    public EmpleadoController(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO=empleadoDAO;
    }

    public void agregarEmpleado(Empleado emp){
        empleadoDAO.add(emp);
    }

    public void list(){
        empleadoDAO.list();
    }

    public void remove(int id){
        empleadoDAO.remove(id);
    }
}