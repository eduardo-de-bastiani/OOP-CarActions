import java.util.Scanner;
public class AppCarro{
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        String placa, marca, modelo, cor;
        double kmRodados, tanque, consumoMedio, km, litros, reais;
        int opcao;

        System.out.println("Digite a placa do carro: ");
        placa = in.nextLine();
        
        
        System.out.println("Digite a marca do carro: ");
        marca = in.nextLine();
        
        
        System.out.println("Digite a modelo do carro: ");
        modelo = in.nextLine();
        

        System.out.println("Digite a cor do carro: ");
        cor = in.nextLine();
        

        System.out.println("Digite a quilometragem do carro: ");
        kmRodados = in.nextDouble();
        

        System.out.println("Digite a capacidade do tanque do carro: ");
        tanque = in.nextDouble();
        

        System.out.println("Digite o consumo médio do carro em LITROS POR KM: ");
        consumoMedio = in.nextDouble();
        
        

        Exer7Carro carro1 = new Exer7Carro(placa, marca, modelo, cor, kmRodados, tanque, consumoMedio);
        carro1.setPlaca(placa);
        carro1.setMarca(marca);
        carro1.setModelo(modelo);
        carro1.setCor(cor);
        carro1.setKmRodados(kmRodados);
        carro1.setTanque(tanque);
        carro1.setConsumoMedio(consumoMedio);
        
        System.out.println("SEU CARRO: ");
        System.out.println(carro1.toString());
        
        AppCarro app = new AppCarro();
        
        
    
        do{
            app.menu(in);
            opcao = in.nextInt();
    
            switch (opcao){
                case 1:{
                    System.out.println("Quantos litros você deseja abastecer? ");
                    litros = in.nextDouble();
                    carro1.abastecerLitros(litros);
                }
                break;
                case 2:{
                    System.out.println("Quantos reais você deseja abastecer? ");
                    reais = in.nextDouble();
                    carro1.abastecerReais(reais);
                }
                break;
                case 3:{
                    System.out.println("Quantos km você deseja andar? ");
                    km = in.nextDouble();
                    carro1.andar(km);
                }
                break;
                case 4:{
                    System.out.println("Seu carro pode andar por mais " + carro1.capacidadeDeslocamento() + " Km");
                }
                break;
                case 5:{
                    System.out.println("Quantos km tem o percurso? ");
                    km = in.nextDouble();
                    System.out.println("Para este percurso é necessário " + carro1.previsaoCombustivel(km) + " litros de gasolina");
                }
                break;
                default:{
                    System.out.println("Valor inválido");
                }
                break;
            }
            System.out.println("\nStatus atual do carro: ");
            System.out.println("Combustível no tanque: " + carro1.getTanque() + " L");
            System.out.println("Quilometragem rodada: " + carro1.getKmRodados() + " Km");
        }while(opcao != 0);
    }
    public void menu(Scanner in){
        System.out.println("Digite a função desejada: ");
        System.out.println("0 - SAIR ");
        System.out.println("1 - Abastecer Litros ");
        System.out.println("2 - Abastecer Reais ");
        System.out.println("3 - Andar ");
        System.out.println("4 - Capacidade Deslocamento ");
        System.out.println("5 - Previsão Combustível ");
    }
}