package com.company;
class Shape
{
    int h = 20;
    int w = 40;
    int l = 90;
    int v = 2;
    public void ToString()
    {
        System.out.println(this.h + " " + this.w + " " + this.l + " " + this.v);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape classter = new Shape();
        classter.ToString();
    }
}
