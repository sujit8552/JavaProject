package ExceptionHandling2;

// custom exception

class CustomException extends Exception
{
    CustomException(){
        System.out.println("Custom exception called");
    }
}

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int amount = 100;
        int balance = 50;
        try {
            if (amount > balance){
                throw new CustomException();
            }
        }
        catch (CustomException e){
            System.out.println(e);
        }

    }
}
