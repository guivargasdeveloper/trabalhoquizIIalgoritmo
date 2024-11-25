public class Quiz {
        public static void main(String[] args) {
                System.out.println("Faculdade Alfredo Nasser");
                System.out.println("Aluno: Guilherme Augusto de Oliveira Vargas");
                System.out.println("Professor: Brenno");
                System.out.println("Bem-vindo ao Quiz!");
                System.out.println("Responda 15 perguntas de múltipla escolha.");

                Questao[] questoes = new Questao[15];

                questoes[0] = criarQuestao("Qual empresa desenvolveu o sistema operacional Android?",
                                "[A] Microsoft", "[B] Google", "[C] Apple", "[D] Samsung", "[E] IBM", "B");

                questoes[1] = criarQuestao("O que significa a sigla 'HTTP'?",
                                "[A] HyperText Transfer Protocol", "[B] High Transfer Technology Protocol",
                                "[C] Hyper Terminal Transfer Path", "[D] High Text Transfer Port",
                                "[E] HyperText Transfer Pathway", "A");

                questoes[2] = criarQuestao("Qual foi o primeiro computador pessoal amplamente popularizado?",
                                "[A] Commodore 64", "[B] IBM PC", "[C] Apple II", "[D] Altair 8800", "[E] ZX Spectrum",
                                "C");

                questoes[3] = criarQuestao("Em que ano foi lançado o primeiro iPhone?",
                                "[A] 2005", "[B] 2006", "[C] 2007", "[D] 2008", "[E] 2009", "C");

                questoes[4] = criarQuestao(
                                "Qual é a linguagem de programação usada para criar a maioria dos aplicativos web?",
                                "[A] Python", "[B] Java", "[C] JavaScript", "[D] PHP", "[E] Ruby", "C");

                questoes[5] = criarQuestao("O que significa a sigla 'IoT'?",
                                "[A] Internet of Technology", "[B] Internet of Things", "[C] Interface of Transmission",
                                "[D] Integration of Tools", "[E] Internet of Transfers", "B");

                questoes[6] = criarQuestao("Qual empresa criou o processador Intel Core i7?",
                                "[A] AMD", "[B] Qualcomm", "[C] NVIDIA", "[D] Intel", "[E] ARM", "D");

                questoes[7] = criarQuestao("Qual foi a primeira rede social popular da era moderna?",
                                "[A] Facebook", "[B] MySpace", "[C] Orkut", "[D] LinkedIn", "[E] Friendster", "B");

                questoes[8] = criarQuestao(
                                "Qual linguagem de programação é conhecida por sua simplicidade e uso em aprendizado de máquina?",
                                "[A] Java", "[B] C++", "[C] Python", "[D] R", "[E] Ruby", "C");

                questoes[9] = criarQuestao("Qual é a unidade de medida básica para armazenamento de dados?",
                                "[A] Byte", "[B] Bit", "[C] Megabyte", "[D] Kilobyte", "[E] Gigabyte", "B");

                questoes[10] = criarQuestao("Qual é a tecnologia de conexão sem fio mais utilizada atualmente?",
                                "[A] Bluetooth", "[B] Wi-Fi", "[C] NFC", "[D] 5G", "[E] IR", "B");

                questoes[11] = criarQuestao("O que significa a sigla 'URL'?",
                                "[A] Universal Resource Link", "[B] Uniform Resource Locator", "[C] Uniform Relay Link",
                                "[D] Universal Relay Locator", "[E] Universal Resource Locator", "B");

                questoes[12] = criarQuestao("Qual empresa desenvolveu a assistente virtual chamada Alexa?",
                                "[A] Google", "[B] Microsoft", "[C] Amazon", "[D] Apple", "[E] Samsung", "C");

                questoes[13] = criarQuestao("Qual é a principal funcionalidade do blockchain?",
                                "[A] Streaming de vídeos", "[B] Controle de dispositivos IoT",
                                "[C] Registro descentralizado de transações", "[D] Desenvolvimento de aplicativos",
                                "[E] Criação de sites", "C");

                questoes[14] = criarQuestao(
                                "Qual é o nome da inteligência artificial da OpenAI que conversa com os usuários?",
                                "[A] Alexa", "[B] ChatGPT", "[C] Siri", "[D] Cortana", "[E] Google Assistant", "B");

                int acertos = 0;
                for (int i = 0; i < questoes.length; i++) {
                        System.out.println("Pergunta " + (i + 1) + ":");
                        questoes[i].escrevaQuestao();
                        String resposta = questoes[i].leiaResposta();
                        if (questoes[i].isCorreta(resposta)) {
                                acertos++;
                        }
                }

                int erros = questoes.length - acertos;
                double porcentagem = ((double) acertos / questoes.length) * 100;

                System.out.println("Fim do Quiz!");
                System.out.println("Você acertou: " + acertos);
                System.out.println("Você errou: " + erros);
                System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
        }

        public static Questao criarQuestao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD,
                        String opcaoE, String correta) {
                Questao q = new Questao();
                q.pergunta = pergunta;
                q.opcaoA = opcaoA;
                q.opcaoB = opcaoB;
                q.opcaoC = opcaoC;
                q.opcaoD = opcaoD;
                q.opcaoE = opcaoE;
                q.correta = correta;
                return q;
        }
}
