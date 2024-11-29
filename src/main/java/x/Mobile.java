package x;

public class Mobile {
	Camera camera;

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Mobile [camera=" + camera + "]";
	}

}