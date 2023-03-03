package provaJobRotation;

public class FaturamentoPorEstado {

    public static void main(String[] args) {
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;

        System.out.println("Percentual de representação do faturamento por estado:");
        System.out.println("SP: " + percentualSP + "%");
        System.out.println("RJ: " + percentualRJ + "%");
        System.out.println("MG: " + percentualMG + "%");
        System.out.println("ES: " + percentualES + "%");
        System.out.println("Outros: " + percentualOutros + "%");
    }
}
