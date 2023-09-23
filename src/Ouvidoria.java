import java.util.ArrayList;

public class Ouvidoria {

    ArrayList<Reclamacoes> listaReclamacoes = new ArrayList<Reclamacoes>();

    static boolean isValid(String verification) {
        String noSpace = verification.trim();

        if (noSpace != null && noSpace != "") {
            return true;
        }
        return false;
    }

    public String listarReclamacoes() {
        String listagemReclamacoes = "Lista de Reclamações \n\t" +
                " ______________________________________________________\n";

        if (listaReclamacoes.size() == 0) {
            listagemReclamacoes = "Sua lista está vazia";
        } else {
            for (int i = 0; i < listaReclamacoes.size(); i++) {
                String itemReclamacao = "Codigo: " + listaReclamacoes.get(i).getCodigo() +
                        "\n  Titulo: " + listaReclamacoes.get(i).getTitulo() +
                        "\n\t  Autor: " + listaReclamacoes.get(i).getAutor() +
                        "\n\t ______________________________________________________\n";

                listagemReclamacoes = listagemReclamacoes + itemReclamacao;
            }
        }

        return listagemReclamacoes;
    }

    public String mostraReclamacaoPorCodigo(int codigoParaPesquisa) {
        Reclamacoes minhaBuscaReclamacoes = listaReclamacoes.get(codigoParaPesquisa - 1);
        String resultadoBuscaReclamacao = "Resultado: " +
                "\n\t Codigo: " + minhaBuscaReclamacoes.getCodigo() +
                "\n\t Titulo: " + minhaBuscaReclamacoes.getTitulo() +
                "\n\t Descrição: " + minhaBuscaReclamacoes.getReclamacao() +
                "\n\t Autor: " + minhaBuscaReclamacoes.getAutor() +
                "\n\t Data: " + minhaBuscaReclamacoes.getData();

        return resultadoBuscaReclamacao;

    }

    public String adicionarReclamacao(int codigo, String reclamacao, String autor, String data, String titulo) {
        Reclamacoes novaReclamacao;
        if (isValid(titulo) && isValid(autor) && isValid(data)) {
            novaReclamacao = new Reclamacoes(codigo, reclamacao, autor, data, titulo);
            listaReclamacoes.add(novaReclamacao);
        } else {
            novaReclamacao = new Reclamacoes(codigo, reclamacao);
            listaReclamacoes.add(novaReclamacao);
        }

        return "Adicionado com Sucesso!";
    }

    public String removerReclamacao(int posicaoLista) {
        for (Reclamacoes reclamacao : listaReclamacoes) {
            if (reclamacao.getCodigo() == posicaoLista) {
                listaReclamacoes.remove(reclamacao);
                return "Reclamação de ID " + posicaoLista + " removida com sucesso!";
            }
        }

        return "A reclamação mencionada não existe!";
    }

    public String alterarReclamaçãoPeloCodigo(int codigoParaPesquisa, String reclamacaoAlterada) {
        if (isValid(reclamacaoAlterada)) {
            Reclamacoes reclamacoesPesquisadas = listaReclamacoes.get(codigoParaPesquisa - 1);
            reclamacoesPesquisadas.setReclamacao(reclamacaoAlterada);
            return "Alterado com sucesso!";
        }
        return "Insira uma reclamação e tente novamente.";
    }
}

