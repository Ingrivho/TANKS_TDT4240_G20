package com.tanks.game.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.tanks.game.sprites.Barrel;
import com.tanks.game.sprites.Tank;

public class TempPlayState extends States {

    private Tank tank;
    private Barrel b;
    private ShapeRenderer s;

    public TempPlayState(GameStateManager gsm) {
        super(gsm);

        tank = new Tank(0,0);
        b = new Barrel(tank);
        s = new ShapeRenderer();

//      tank = new Texture("something");
    }

    @Override
    public void handleInput() {
        HandleTank();
        HandleBrrel();



    }

    @Override
    public void update(float dt) {
        handleInput();
        tank.update(dt);
        b.update(dt);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(tank.getTenk(),tank.getPossition().x,tank.getPossition().y, (float) tank.getTenk().getWidth()/2, (float) tank.getTenk().getHeight()/2,(float) tank.getTenk().getWidth(),(float) tank.getTenk().getHeight(),(float) 1,(float)1,tank.getroatation());
        //sb.draw(b.getRectangle(),20,20);
        //ShapeRenderer rectangle = new ShapeRenderer();
        //rectangle.rect(10,10,10,10);
        //sb.draw(tank.getTenk(),tank.getPossition().x,tank.getPossition().y);
        sb.end();
//        s.begin(ShapeRenderer.ShapeType.Filled);
//        s.setColor(Color.WHITE);
//        s.rect(10,10,90,90);
//        s.end();



    }

    public void HandleTank(){
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            tank.Right();
            //System.out.println(tank.velocety.x);
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            tank.Left();
        }
        else{
            tank.StandStill();
        }

    }

    public void HandleBrrel(){
        if(Gdx.input.isKeyPressed((Input.Keys.UP))){
            b.left();
        }
        else if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
           b.right();
        }
        else{

        }
    }



    @Override
    public void dispose() {

    }
}
