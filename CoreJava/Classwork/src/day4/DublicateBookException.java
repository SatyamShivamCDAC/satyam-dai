package day4;

class DuplicateBookException extends Exception{

    public DuplicateBookException()
    {
        super("Book exists");
    }
}
