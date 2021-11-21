package com.taller.crud;

public class Student {
    private Long id;
    private String name;
    private String apellido;
    private int semestre;

    public Student(){}

    public Student(Long id,String name,String apellido,int semestre){
        this.id=id;
        this.name=name;
        this.apellido=apellido;
        this.semestre=semestre;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public int getSemestre(){
        return semestre;
    }

    public void setSemestre(int semestre){
        this.semestre=semestre;
    }
    
}
