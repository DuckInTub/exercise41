/**
 * Created by Niklas on 2016-02-07.
 */
public class Tuple<Type1, Type2>{
    private final Type1 first;
    private final Type2 second;

    public Tuple(Type1 first, Type2 second) {
        this.first = first;
        this.second = second;
    }

    public Type1 getFirst() {
        return first;
    }

    public Type2 getSecond() {
        return second;
    }
}

