package org.andresoviedo.app.model3D.model;

public interface Object3D {

	Object3D setId(String id);

	float[] getPosition();

	void setPosition(float[] position);

	float[] getColor();

	Object3D setColor(float[] color);

	void draw(float[] mvpMatrix, float[] mvMatrix);

	void draw(float[] mvpMatrix, float[] mvMatrix, int drawType, int drawSize);

	void translateX(float f);

	void translateY(float f);

	float[] getRotation();

	void setRotationZ(float rz);

	float getRotationZ();

	void setRotation(float[] rotation);

	int getDrawSize();

}