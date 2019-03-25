package com.tanks.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.tanks.game.state.GameStateManager;
import com.tanks.game.state.TempPlayState;

// Tanks
public class TANKS extends ApplicationAdapter {
	// size of screen to be decided
	public static int WIDTH = 600;
	public static int HIGHT= 600;

	public static final String TITLE = "TANKS";

	private GameStateManager gsm;
	private SpriteBatch batch;
//	private ShapeRenderer s;

	
	@Override
	public void create () {

		batch = new SpriteBatch();
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new TempPlayState(gsm));
//		s = new ShapeRenderer();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
//		s.begin(ShapeRenderer.ShapeType.Filled);
//		s.setColor(Color.WHITE);
//		s.rect(10,10,90,90);
//		s.end();

//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
