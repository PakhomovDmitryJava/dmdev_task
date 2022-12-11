package hometask11;

public class MissedIdException extends NullPointerException {
    private Integer id;

    public int getId(){
        return id;
    }
    public MissedIdException(String message, Integer id){
        super(message);
        this.id =id;
    }
}
