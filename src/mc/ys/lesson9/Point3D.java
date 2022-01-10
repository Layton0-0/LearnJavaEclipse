package mc.ys.lesson9;

public class Point3D extends Point {

	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y); // super를 호출하려면 생성자 가장 위에 호출해야함.
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return String.format("%3d %3d %3d", x, y, z);
	}
	
}
