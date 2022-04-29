package classesobjetos.exemplo.petshopheranca

fun main() {
    /*Aula de herança e composição*/
    val jessica: PessoaTutora = PessoaTutora("Jessica", "email2@email.com")
    val mingau: Gato = Gato("mingau",
            "gato",
            "ração",
            "branco",
            "pequeno",
            1, 4.0,
            jessica,
            "macia")

    mingau.miar()
    mingau.cadastrarGato()

    val carol: PessoaTutora = PessoaTutora("Carol", "email@email.com")
    val dori: Peixe = Peixe(nomeAnimal = "Dori",
            especie = "peixe",
            tipoAlimentacao = "ração",
            cor = "azul",
            tamanho = "pequena",
            idade = 1,
            peso = 0.1,
            pessoaTutora = carol,
            tipoDeAgua = "doce")
    dori.gloob()
    dori.cadastrarPeixe()


}