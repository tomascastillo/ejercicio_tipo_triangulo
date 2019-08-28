package triangulo;

public class Tipo_triangulo {
	private int lado1, lado2, lado3;
	private String tipo="";
	Tipo_triangulo(int a, int b,int c){
		this.lado1=a;
		this.lado2=b;
		this.lado3=c;
	}

	public boolean es_triangulo () {
		
		if(this.lado1 + this.lado2 <= this.lado3 || this.lado3 + this.lado2 <= this.lado1 || this.lado1 + this.lado3 <= this.lado2)
			return false;
		return true;
		
	}
	
	public String tipo_triangulo() {
		if(this.lado1==this.lado2 && this.lado2==this.lado3)
			this.tipo="EQUILATERO";
		if(this.lado1==this.lado2 && (this.lado1 != this.lado3 || this.lado2 != this.lado3))
			this.tipo="ISOSCELES";
		if(this.lado1 != this.lado2 && this.lado1!=this.lado3 && this.lado3 != this.lado2)
			this.tipo="ESCALENO";
		
		return this.tipo;
				
	}
	

}
