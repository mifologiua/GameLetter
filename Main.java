void main() throws IOException {

    Scanner console = new Scanner(System.in);

    while (true) {

        System.out.println("Введите \"n\" чтобы начать игру");
        System.out.println("Введите \"e\" чтобы выйти из игры");

        String command = console.nextLine().toLowerCase();

        if (command.equals("n")) {
            upperWhile:
            while (true) {

                int errCount = 0;
                TheGallowsPrintConsole printConsole = new TheGallowsPrintConsole();

                ArrayList<Character> letterUsed = new ArrayList<>();

                RightLetterInput rightLetterInput = new RightLetterInput();
                NotRecurring notRecurring = new NotRecurring();

                RandomWord randomWord = new RandomWord();
                String word = randomWord.randomWord();

                OpenMaskWord openMaskWord = new OpenMaskWord();
                MaskWord maskWord = new MaskWord();
                ArrayList<Character> secretWord = maskWord.maskWord(word);

                System.out.println("Ваше слово: " + secretWord);
                System.out.println(word);
                while (true) {
                    System.out.println("Введите букву: ");

                    command = console.nextLine().toLowerCase();

                    if (command.isEmpty()){
                        command = console.nextLine().toLowerCase();
                    }

                    {

                        if (rightLetterInput.isRightLetter(word, command)) {
                            if (!notRecurring.recurring(command, letterUsed)) {
                                System.out.println(secretWord = openMaskWord.open(secretWord, word, command));
                                letterUsed.add(command.charAt(0));
                            } else {
                                System.out.println("Вы вводили данную букву");
                            }
                        } else {
                            if (!notRecurring.recurring(command, letterUsed)){
                                errCount++;
                                System.out.println("Вы ошиблись " + errCount + "/6 ошибок");
                                System.out.println(printConsole.printConsoleErr(errCount));
                                letterUsed.add(command.charAt(0));
                            }else {
                                System.out.println("Вы вводили данную букву");
                            }
                        }
                    }

                    String winner = "";
                    for(char c : secretWord){
                        winner += c;
                    }

                    if (errCount == 6 || winner.equals(word)) {
                        if (winner.equals(word)) {
                            System.out.println("Вы отгадали слово: " + word);
                            break upperWhile;
                        }
                        System.out.println("Вы проиграли, слово было: " + word);
                        break upperWhile;
                    }
                }
            }
        } else if (command.equals("e")) {
            System.exit(0);
        } else {
            System.out.println("Нет такой команды");
        }
    }
}