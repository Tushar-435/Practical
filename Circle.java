package feb_14;
class AggregationEg {// class 1
	int Squre(int r) {// method name square
		return r*r;
	}
}
public class Circle { // class 2
	AggregationEg ref_var; // obj (entity ref)
	double pi=3.14;
	double area (int radius) {// pi*r*r
		AggregationEg ref_var= new AggregationEg();//object
		int psqure = ref_var.Squre(radius);
		return pi*psqure;
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println("Area:"+result);
	}

}