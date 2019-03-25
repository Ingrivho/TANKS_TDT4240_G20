package com.tanks.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.sun.org.apache.xerces.internal.util.ShadowedSymbolTable;

public class Tank {

    private Vector2 possition;
    private Vector2 velocety;
    private float rotation;
    private Barrel barrel;

    private Texture tank;
    private Sprite T;

    public Tank(int x, int y){
        tank = new Texture("heli1.png");
        this.barrel = barrel;
        T = new Sprite(tank);
        // give every tank a random possition
        possition = new Vector2(x,y);
        velocety = new Vector2(0,0);
        T.setRotation(5);
        rotation = 0;

    }

    public void update(float dt){

        //System.out.println(velocety.x);
        velocety.scl(dt);
        possition.add(velocety.x,0);
        //System.out.println(possition.x);
        velocety.scl(1/dt);


    }

    public void Right(){
        velocety.x = 100;
        //System.out.print(velocety.x);
    }
    public void Left(){
        velocety.x = -100;

    }

    public void StandStill(){
        velocety.x = 0;
    }




    public Vector2 getPossition() {
        return possition;
    }

    public Sprite getTenk() {
        return T;
    }

    public void rotate(){
        rotation++;
    }

    public float getroatation(){
        return rotation;
    }
}
