public class TheGallowsPrintConsole {
    public String printConsoleErr(int errCount) {

        switch (errCount) {
            case 1:
                return "    _____\n    |\n    |";
            case 2:
                return "    _____\n    |\n    |\n   (.)";
            case 3:
                return "    _____\n    |\n    |\n   (.)\n   /|\\";
            case 4:
                return "    _____\n    |\n    |\n   (.)\n   /|\\\n  / | \\";
            case 5:
                return "    _____\n    |\n    |\n   (.)\n   /|\\\n  / | \\\n    |";
            case 6:
                return "     _____\n    |\n    |\n   (.)\n   /|\\\n  / | \\\n   / \\\n /     \\";

        }
        return null;
    }
}
