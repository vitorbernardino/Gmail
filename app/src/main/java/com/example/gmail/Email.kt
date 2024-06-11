package com.example.gmail



data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview,date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails():MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "Atualizações importantes da sua conta"
        preview = "Caro usuário, temos algumas atualizações importantes relacionadas à sua conta. Por favor, revise as informações abaixo cuidadosamente.. "
        date = "26 jun"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "Confirmação de login"
        preview = "Prezado usuário, detectamos uma tentativa de login suspeita em sua conta. Por favor, confirme sua identidade para garantir a segurança da sua conta..."
        date = "25 jun"
        stared = true
    },
    email {
        user = "Twitter"
        subject = "Notificações de atividade"
        preview = "Caro usuário, você tem algumas notificações de atividade pendentes em sua conta. Acesse agora para ver as últimas interações..."
        date = "24 jun"
        stared = false
        unread = true
    },
    email {
        user = "RiotGames"
        subject = "Atualizações de segurança da conta"
        preview = "Prezado jogador, estamos implementando algumas atualizações de segurança em nossos sistemas. Por favor, revise suas configurações de segurança..."
        date = "23 jun"
        stared = true
    },
    email {
        user = "Mel Lemos"
        subject = "Confirmação de compra"
        preview = "Eu comprei aquela pelucia da kuromi que vc tinhe me pedido"
        date = "23 feb"
        stared = false
    },
    email {
        user = "Bernardo Alves"
        subject = "Quero largar meu emprego"
        preview = "Cara eu quero largar meu emprego pra estudar React"
        date = "22 jun"
        stared = true
    },
    email {
        user = "Bryan Martinez"
        subject = "Hola mano"
        preview = "Estoy vendendo mi pc por 50 mil pesos"
        date = "21 jun"
        stared = false
        unread = true
    },
    email {
        user = "Fabio Jr"
        subject = "Comprei uma skin nova"
        preview = "Me empresta um dinheiro, gastei todo meu salário com skin de Valorant"
        date = "19 jun"
        stared = true
    },
    email {
        user = "Maikel Peixouto"
        subject = "Novo empreendimento"
        preview = "Estou abrindo uma peixaria juntamente com a minha familia e gostaria de convidar"
        date = "18 jun"
        stared = false
    },
    email {
        user = "Lorenzo Cardoso"
        subject = "To indo viajar"
        preview = "Estarei de ferias nas ultimas semanas de julho para uma viagem de negociós"
        date = "17 jun"
        stared = true
    },
    email {
        user = "Thomas Dalanhol"
        subject = "É o grêmio"
        preview = "É o grêmio"
        date = "17 jun"
        stared = false
        unread = true
    },
    email {
        user = "Jeferson Pereira"
        subject = "assunto assunto assunto assunto assunto assunto"
        preview = "conteudo conteudo conteudo conteudo conteudo conteudo "
        date = "16 jun"
        stared = true
    }
)