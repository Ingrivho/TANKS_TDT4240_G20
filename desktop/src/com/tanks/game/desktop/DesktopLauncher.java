package com.tanks.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tanks.game.TANKS;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = TANKS.WIDTH;
		config.height = TANKS.HIGHT;
		config.title = TANKS.TITLE;
		new LwjglApplication(new TANKS(), config);
	}
}
