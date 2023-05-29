
/**
  Implemente a classe Carro, considerando que todo carro possui placa,
marca, modelo, cor, kilometragem e capacidade do tanque de combustivel.
Considere ainda que este objeto mantém uma quantidade de combustível
em seu tanque e o seu consumo médio (km/litros). Defina os atributos e
implemente os métodos: construtor, modificadores, de acesso e toString
para esta classe. A seguir, implemente também o método
  
  (a) abastecerLitros que é responsável por adicionar mais litros de combustivel (parâmetro) ao tanque
  (b) abastecerReais que é responsável também por adicionais mais litros
    de combustível ao tanque, mas a partir de um valor informado (como
    parâmetro) em Reais (R$). Nesse caso, será necessário saber o preço
    do litro de combustível para calcular a quantidade de litros que o
    carro receberá.
    (c) andar que consume combustivel a partir da quantidade (parâmetro)
de km percorrida pelo carro.
     (d) capacidadeDeslocamento que define quantos km o carro pode andar
a partir do combustivel disponível no tanque.
    (e) previsaoCombustivel que informa quantos tanques de combustivel
serão necessários para percorrer uma certa distância (informada como
parâmetro em km).



 * @author (Eduardo De Bastiani) 
 * @version (23/05/23)
 */
public class Exer7Carro
{
    private String placa, marca, modelo, cor;
    private double kmRodados, tanque, consumoMedio,  capacidadeMaxima;
    private final  double GAS = 5.50;
    
    
    public Exer7Carro(String placa, String marca, String modelo, String cor, double km, double tanque, double consumoMedio)
    {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.kmRodados = km;
        this.tanque = tanque;
        this.consumoMedio = consumoMedio;
        this.capacidadeMaxima = tanque;
    }

    public void setPlaca(String placa){
        if (placa.length() == 7){
            this.placa = placa;
        }
    }
    public String getPlaca(){
        return placa;
    }
    
    public void setMarca(String marca){
        if (!this.marca.isEmpty()){
            this.marca = marca;
        }
        
    }
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        if (!this.modelo.isEmpty()){
            this.modelo = modelo;
        }
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setCor(String cor){
        if (!this.cor.isEmpty()){
            this.cor = cor;
        }
    }
    public String getCor(){
        return cor;
    }
    
    public void setKmRodados(double kmRodados){
        if (kmRodados >= 0){
            this.kmRodados = kmRodados;
        }
    }
    public double getKmRodados(){
        return kmRodados;
    }
    
    public void setTanque(double tanque){
        if (tanque >= 15){
            this.tanque = tanque;
        }
    }
    public double getTanque(){
        return tanque;
    }
    
    public void setConsumoMedio(double comsumoMedio){
        if (comsumoMedio >= 0){
            this.consumoMedio = consumoMedio;
        }
    }
    public double getConsumoMedio(){
        return consumoMedio;
    }
    public void abastecerLitros(double litros) {
        if (litros > 0) {
            double capacidadeDisponivel = capacidadeMaxima - this.tanque;
            if (litros <= capacidadeDisponivel) {
                this.tanque += litros;
            } 
            else {
            this.tanque = capacidadeMaxima;
            }
        }
    }

    public void abastecerReais(double reais) {
        if (reais > 0) {
            double litrosAbastecidos = reais / GAS;
            abastecerLitros(litrosAbastecidos);
        }
    }
    public void andar(double km) {
    double combustivelConsumido = km / consumoMedio;
    if (combustivelConsumido <= tanque) {
        tanque -= combustivelConsumido;
        kmRodados += km;
    } 
    else {
        System.out.println("Não há combustível suficiente para percorrer essa distância!");
        }
    }
    public double capacidadeDeslocamento(){
        return tanque * consumoMedio;
    }

    public double previsaoCombustivel(double km){
        return km * consumoMedio;
    }
    
    public String toString() {
        return "Placa: " + placa +"\nMarca: " + marca +"\nModelo: " + modelo +"\nCor: " + cor +"\nQuilometragem: " + kmRodados + 
        " Km" +"\nTanque: " + tanque + " L" +"\nConsumo Médio: " + consumoMedio + " L/Km\n";
    }
}

