package revisit;

// Static Import was introduced in Java Version 5
// Importing static members of the Math class for direct access
import static java.lang.Math.*;

/**
 * The StaticImport class demonstrates the use of static imports in Java.
 * Static imports allow direct access to static members (methods and fields)
 * without qualifying them with the class name.
 */
public class StaticImport {

    /**
     * The main() method calculates and prints the area of a circle given a radius.
     */
    public static void main(String[] args) {
        int radius = 10;
        // Using static imports for PI and pow directly without Math. prefix
        System.out.println("Area: " + PI * pow(radius, 2));
    }

    // 📌 Points to remember
        // 1️⃣ Static import statements are written as “import static” in code and not “static import”.
        // 2️⃣ If we import two static fields with same name explicitly e.g. Integer.MAX_VALUE and Long.MAX_VALUE then Java will throw compile time error.
        // 3️⃣ But if other static modifier is not imported explicitly for ex. we have imported java.lang.Long.*, MAX_VALUE will refer to Integer.MAX_VALUE.
        // 4️⃣ We can apply static import statement not only on static fields but also on static methods in Java.
}
