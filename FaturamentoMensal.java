package provaJobRotation;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FaturamentoMensal {
    public static void main(String[] args) {

        List<Double> faturamentoDiario = new ArrayList<Double>();
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("faturamento.json"));
            JSONObject jsonObj = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObj.get("faturamentoDiario");
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject faturamento = (JSONObject) jsonArray.get(i);
                Double valor = (Double) faturamento.get("valor");
                faturamentoDiario.add(valor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        double menorFaturamento = Collections.min(faturamentoDiario);
        double maiorFaturamento = Collections.max(faturamentoDiario);

        double somaFaturamento = 0;
        int numDiasFaturamento = 0;
        for (Double valor : faturamentoDiario) {
            if (valor > 0) {
                somaFaturamento += valor;
                numDiasFaturamento++;
            }
        }
        double mediaFaturamento = somaFaturamento / numDiasFaturamento;

        int numDiasSuperiorMedia = 0;
        for (Double valor : faturamentoDiario) {
            if (valor > mediaFaturamento) {
                numDiasSuperiorMedia++;
            }
        }

        // Imprime os resultados
        System.out.println("Menor faturamento: R$ " + menorFaturamento);
        System.out.println("Maior faturamento: R$ " + maiorFaturamento);
        System.out.println("Média mensal de faturamento: R$ " + mediaFaturamento);
        System.out.println("Número de dias em que o faturamento diário foi superior à média mensal: " + numDiasSuperiorMedia);
    }
}
