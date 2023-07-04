package Inheritance;

public class ScientificMain {
public static void main(String[] args) {
	scientificCalculator Sc = new scientificCalculator();
	Sc.add(10,10);
    Sc.calSinTheta();
    Sc.add(10, 10, 10);
    Sc.calCosTheta();
    Sc.sub(50, 30);
    Sc.calSinTheta();
    Sc.sub(100, 50, 10);
    Sc.calCosTheta();
    Sc.mul(10, 10);
    Sc.calSinTheta();
    Sc.mul(10, 20, 30);
    Sc.calCosTheta();
}
}
