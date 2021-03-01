package ch4.sunmin.item17;

public final class Complex { // 불변 객체
	
	public static final Complex ZERO 	= new Complex(0, 0);
	public static final Complex ONE 	= new Complex(1, 0);
	public static final Complex I 		= new Complex(0, 1);
	
	private final double re;
	private final double im;
	
	private Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public double realPart() {return re;} // 접근자 메서드로 필드의 불변을 보장한다.
	public double imaginaryPart() {return im;}
	
	public Complex plus(Complex c) { // 자신은 수정하지 않고 새로운 Complex 인스턴스를 만들어 반환한다.
		return new Complex(re + c.re, im + c.im);
	}
	
	public Complex minus(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}
	
	// 정적 팩터리
	public static Complex valueOf(double re, double im) {
		return new Complex(re, im);
	}	

}
