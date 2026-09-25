fun main() {
    var opcao = -1

    while (opcao != 0) {
        println("---------------------------------")
        println("MENU DE EXERCICIOS")
        println("---------------------------------")
        println("1 - Primeiros Passos")
        println("2 - Condicionais")
        println("3 - Lacos de Repeticao")
        println("0 - Sair")
        print("Escolha uma opcao: ")

        opcao = readln().toInt()

        if (opcao == 1) {
            println("\n--- 1) Primeiros Passos ---")

            // 1.1
            var nome_do_carro = "Fusca"
            println("O carro e o " + nome_do_carro)

            // 1.2 e 1.3
            print("Digite o seu nome: ")
            var nomeUsuario = readln()

            print("Digite a sua idade: ")
            var idadeUsuario = readln()

            println("Ola, " + nomeUsuario + ", sua idade e " + idadeUsuario)

            // Extras
            println("Nome em maiusculo: " + nomeUsuario.uppercase())
            println("Seu nome tem " + nomeUsuario.length + " letras")

        } else if (opcao == 2) {
            println("\n--- 2) Condicionais ---")

            print("Digite o valor 1: ")
            var v1 = readln().toDouble()
            print("Digite o valor 2: ")
            var v2 = readln().toDouble()
            print("Digite o valor 3: ")
            var v3 = readln().toDouble()

            // 2.1 Maior de dois
            if (v1 > v2) {
                println("O maior entre 1 e 2 e: " + v1)
            } else {
                println("O maior entre 1 e 2 e: " + v2)
            }

            // 2.2 Positivo, negativo ou zero
            if (v1 > 0) {
                println("O primeiro valor e Positivo.")
            } else if (v1 < 0) {
                println("O primeiro valor e Negativo.")
            } else {
                println("O primeiro valor e Zero.")
            }

            // 2.3 Maior de tres na forca bruta
            var maior = v1
            if (v2 > maior) {
                maior = v2
            }
            if (v3 > maior) {
                maior = v3
            }
            println("O maior de todos os 3 e: " + maior)

            // 2.4 Soma dos 2 maiores (acha o menor e tira da soma total)
            var menor = v1
            if (v2 < menor) {
                menor = v2
            }
            if (v3 < menor) {
                menor = v3
            }
            var somaDosMaiores = (v1 + v2 + v3) - menor
            println("A soma dos dois maiores e: " + somaDosMaiores)

            // 2.9 Voto
            print("\nQual ano voce nasceu? ")
            var anoNascimento = readln().toInt()
            var idade = 2026 - anoNascimento

            if (idade >= 16) {
                println("Voce ja tem " + idade + " anos. Pode votar!")
            } else {
                println("Voce tem " + idade + " anos. Nao pode votar.")
            }

        } else if (opcao == 3) {
            println("\n--- 3) Lacos de Repeticao ---")

            // 3.1 Bomba relogio
            print("De qual numero a contagem regressiva vai comecar? ")
            var contador = readln().toInt()

            while (contador >= 0) {
                print(contador.toString() + "... ")
                contador = contador - 1
            }
            println("EXPLOSAO!")

            // 3.2 Divisao
            print("\nDigite o numero que vai ser dividido: ")
            var dividendo = readln().toDouble()
            var divisor = 0.0

            while (divisor <= 0) {
                print("Digite por qual numero quer dividir (nao pode ser zero nem negativo): ")
                divisor = readln().toDouble()
            }
            var resultado = dividendo / divisor
            println("O resultado e: " + resultado)

            // 3.3 Media de 15 a 100
            var numeroAtual = 15
            var somaTudo = 0.0
            var quantidade = 0

            while (numeroAtual <= 100) {
                somaTudo = somaTudo + numeroAtual
                quantidade = quantidade + 1
                numeroAtual = numeroAtual + 1
            }
            var mediaLaco = somaTudo / quantidade
            println("\nA media dos numeros de 15 a 100 e: " + mediaLaco)

            // 3.5 Notas
            var tentarDeNovo = "S"
            var alunosPassaram = 0

            while (tentarDeNovo == "S" || tentarDeNovo == "s") {
                print("\nDigite a primeira nota: ")
                var n1 = readln().toDouble()
                print("Digite a segunda nota: ")
                var n2 = readln().toDouble()

                var mediaAluno = (n1 + n2) / 2
                println("A media ficou: " + mediaAluno)

                if (mediaAluno >= 9.5) {
                    alunosPassaram = alunosPassaram + 1
                }

                print("Calcular de outro aluno? (S/N): ")
                tentarDeNovo = readln()
            }
            println("Total de alunos que passaram: " + alunosPassaram)

            // 3.8 Maiores que 100
            println("Os 10 primeiros maiores que 100:")
            var num = 101
            var impressos = 0
            while (impressos < 10) {
                print(num.toString() + " ")
                num = num + 1
                impressos = impressos + 1
            }
            println("")

        } else if (opcao == 0) {
            println("Fim do programa.")
        } else {
            println("Opcao invalida. Digite de novo.")
        }
    }
}