package com.DesignPattern.BuilderDesign;


interface Builder {

    public void buildFloor();

    public void buildWalls();

    public void bulidTerrace();

    public Home getComplexHomeObject();

}
