package ProgrammingLogic.RockPaperScissors.domain;

public enum Option {

    ROCK {
        @Override
        public Option win() {
            return SCISSORS;
        }
    },
    PAPER {
        @Override
        public Option win() {
            return ROCK;
        }
    },
    SCISSORS {
        @Override
        public Option win() {
            return PAPER;
        }
    };

    public abstract Option win();
}
