public class Main {

    public static void main(String[] args) {

        float initial = 100;
        float added = 1001;
        float bonus = (initial + added + (added/100));

            if (added < 1000)
                { bonus = initial + added;}

        System.out.println(bonus);
    }}
