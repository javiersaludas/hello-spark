import static spark.Spark.*;
/**
 * Created by javis on 12/01/2017.
 */
public class HelloSpark {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello spark!");
    }
}