package tasks;

/**
 * Find the maximum number of a piece of n cuts
 * Created by zOpa
 */
public class Pizza {

    public int pieces (int n) { //todo english

        if (n < 0) {
            throw new IllegalArgumentException("cannot be negative, you input - " + n);
        }

        if (n > 46340){
            throw new IllegalArgumentException("too much. Input no much 46340");
        }

        return (n*(n+1)/2)+1;
    }
}
