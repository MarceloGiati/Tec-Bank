public class TestaBanco {
    public static void main(String[] args) {
        Cliente marcelo = new Cliente();
        marcelo.setNome("Marcelo Giati");
        marcelo.setCpf("222.222.222.-22");
        marcelo.setProfissao("Developer JR");

        Conta contaDoMarcelo = new Conta(6646, 969060);
        contaDoMarcelo.deposita(100);

        contaDoMarcelo.setTitular(marcelo);
        System.out.println(contaDoMarcelo.getTitular().getNome());
        System.out.println(contaDoMarcelo.getTitular());
    }
}