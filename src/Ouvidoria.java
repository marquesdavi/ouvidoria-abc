import java.util.ArrayList;
import java.util.stream.IntStream;

public class Ouvidoria {

    ArrayList<Reclamacoes> listaReclamacoes = new ArrayList<Reclamacoes>();

    public String listarReclamacoes() {
        String listagemReclamacoes = "Lista de Reclamações \n\t" +
                " ______________________________________________________\n";

        if (listaReclamacoes.size() == 0) {
            listagemReclamacoes = "Sua lista está vazia";
        }
        else {
            for (int i = 0; i < listaReclamacoes.size(); i++) {
                String itemReclamacao =  "\n  Titulo: " + listaReclamacoes.get(i).getTitulo() +
                        "\n\t  Descrição: " + listaReclamacoes.get(i).getReclamacao() +
                        "\n\t  Autor: " + listaReclamacoes.get(i).getAutor() +
                        "\n\t  Data: " + listaReclamacoes.get(i).getData() +
                        "\n\t ______________________________________________________\n";

                listagemReclamacoes = listagemReclamacoes + itemReclamacao;
            }
        }

        return listagemReclamacoes;
    }

    // public String listaReclamacoesPorCodigo(int codigoParaPesquisa) {
    // 	Reclamacoes minhaBuscaReclamacoes = listaReclamacoes.get(codigoParaPesquisa - 1);
    //     String resultadoBuscaReclamacao = "Resultado: \n\t " +
    //     		minhaBuscaReclamacoes.getTitulo() +
    //         "\n\t Descrição: " + minhaBuscaReclamacoes.getReclamacao() +
    //         "\n\t Autor: " + minhaBuscaReclamacoes.getAutor() +
    //         "\n\t Data: " + minhaBuscaReclamacoes.getData();

    //     return resultadoBuscaReclamacao;

    // }

    public String adicionarReclamacao(int codigo, String reclamacao, String autor, String data, String titulo) {
        Reclamacoes novaReclamacao;
        if (titulo != null && autor != null && data != null) {
            novaReclamacao = new Reclamacoes(codigo, reclamacao, autor, data, titulo);
            listaReclamacoes.add(novaReclamacao);
        } else {
            novaReclamacao = new Reclamacoes(codigo, reclamacao);
            listaReclamacoes.add(novaReclamacao);
        }

            return "Adicionado com Sucesso!";
    }

//     public String removerReclamacao(int posicaoLista) {
//
//        if (listaReclamacoes.contains(posicaoLista - 1)){
//            listaReclamacoes.remove(posicaoLista - 1);
//            return "Reclamação " + listaReclamacoes.get(posicaoLista - 1).getCodigo() + "Removido com sucesso!";
//        } else {
//            return "A reclamação mencionada não existe!";
//        }
//     }

//     public void alterarReclamaçãoPeloCodigo(int codigoParaPesquisa, String reclamacaoAlterada ){
//         Reclamacoes reclamacoesPesquisadas = listaReclamacoes.get(codigoParaPesquisa-1);
//         reclamacoesPesquisadas.setTitulo(reclamacaoAlterada);
//
//         return "Alterado com sucesso!";
//
//
//     }


    }

