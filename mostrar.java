public class mostrar{
    public static void main(String args[]){
        // Iphone 16, tela 6.1, 256gb
        // Galaxy A23 ultra, tela 6.9, 256gb
        // Xiome 17 Pro, tela 6.81, 128gb
        // <tipoVariavel> nomeVariuavel = valor;

        //DECLARANDO UM OBJ DO TIPO CELULAR = INSTANCIANDO UM OBJ
        Celular cellA = new Celular(); 
        cellA.nome = "Iphone 15";
        cellA.tamanhoTela = 6.1;
        cellA.espacoArmazenamento = 256;
        cellA.sistemaOperacional = "iOS";

        Celular cellB = new Celular();
        cellB.nome = "Galaxy A23 Ultra";
        cellB.tamanhoTela = 6.9;
        cellB.espacoArmazenamento = 256;
        cellB.sistemaOperacional = "Android";

        Celular cellC = new Celular();
        cellC.nome = "Xiome 17 Pro";
        cellC.tamanhoTela = 6.81;
        cellC.espacoArmazenamento = 128;
        cellC.sistemaOperacional = "Android";
        
        //IMPRIMINDO OS DADOS DO CELULAR
        System.out.println("Celular " + cellA.nome + " com tela de " + cellA.tamanhoTela + " com " + cellA.espacoArmazenamento + " e SO " + cellA.sistemaOperacional );
        System.out.println("Celular " + cellB.nome + " com tela de " + cellB.tamanhoTela + " com " + cellB.espacoArmazenamento + " e SO " + cellB.sistemaOperacional);
        System.out.println("Celular " + cellC.nome + " com tela de " + cellC.tamanhoTela + " com " + cellC.espacoArmazenamento + " e SO " + cellC.sistemaOperacional);
    }
}