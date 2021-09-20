package exercicio;

public class Retangulo {

	private double largura;
    private double altura;
    private double area;
    private double perimetro;
    private double diagonal;
    
    public Retangulo(double largura, double altura, double area, double perimetro, double diagonal) {
    
        this.largura = largura;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
        this.diagonal = diagonal;
    
}

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}
