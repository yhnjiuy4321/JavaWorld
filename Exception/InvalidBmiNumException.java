public class InvalidBmiNumException extends Exception{

    public InvalidBmiNumException() {
    }

    public InvalidBmiNumException(String message) {
        super(message);

        /*
        用意是說，當例外發生時，會把message傳給父類別Exception，然後Exception會把message傳給Throwable
        所以用super後，我可以在使用到例外時去輸出自己想要的訊息，而不是預設的訊息

        >>>Exception是所有例外的父類別，所以可以用Exception來捕捉所有例外
         */
    }
}
