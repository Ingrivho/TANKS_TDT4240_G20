package com.tanks.game.sprites;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;

public class Barrel {
    private float BARRELHEIGHT= 60;
    private float BARRELWIDTH=10;
     ShapeRenderer s;
     Texture t;
     float number = 0;
     private Tank tank;

    public Barrel(Tank tank){
        s = new ShapeRenderer();
        this.tank = tank;



    }

    public void update(float dt){

        System.out.println(number);
        s.begin(ShapeRenderer.ShapeType.Filled);
        s.setColor(Color.WHITE);
        s.rect(tank.getPossition().x + (tank.getTenk().getWidth()/2),tank.getPossition().y + tank.getTenk().getHeight(),BARRELWIDTH/2,0,BARRELWIDTH,BARRELHEIGHT,(float) 1,(float) 1,number);

        s.end();



    }

    public void left(){
        if(number < 90) {
            number++;
        }
        else{
            number = 90;
        }
    }

    public void right(){
        if(number > -90) {
            number--;
        }
        else{
            number = -90;
        }

    }



//    public ShapeRenderer getRectangle(){
//        return this.rectangle;
//    }
}
