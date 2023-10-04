package PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Daniel", 5138);
        agendaContatos.adicionarContato("Daniel DIO", 51389);
        agendaContatos.adicionarContato("Daniel Mestre", 5138910);
        agendaContatos.adicionarContato("Daniel 19", 513891011);
        agendaContatos.adicionarContato("Daniel Pe", 513891022);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Daniel"));

        System.out.println("Novo número adicionado: " + agendaContatos.atualizarNumeroContato("Daniel", 546432));
    }
}
