class Cyrcle{
	private int x; // Координаты центра
	private int y;
	private double radius;

// 2 pi r -- периметр
// pi r^2 -- площадь

	public Cyrcle(int x, int y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double perimetr(){
		return 2 * 3.14 * this.radius;
	}

	public double square(){
		return 3.14 * this.radius * this.radius;
	}

	public boolean common(Cyrcle cyrcle){
		boolean res = false;
		if (this.x == cyrcle.getX() && this.y == cyrcle.getY()){
			res = true;
		}
		else if (this.radius == cyrcle.getRadius()){  // Общие точки на границе круга
			if (this.x == cyrcle.getX()){
				if (this.y + this.radius == cyrcle.getY() - cyrcle.getRadius() || this.y - this.radius == cyrcle.getY() + cyrcle.getRadius()){
					res = true;
				}
			}
			if (this.y == cyrcle.getY()){
				if (this.x + this.radius == cyrcle.getX() - cyrcle.getRadius() || this.x - this.radius == cyrcle.getX() + cyrcle.getRadius()){
					res = true;
				}
				
			}
		}
		return res;

	}

	public boolean equals(Cyrcle cyrcle){
		if (this.radius == cyrcle.getRadius()){
			return true;
		} 
		else{
			return false;
		}
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public double getRadius(){
		return this.radius;
	}
}