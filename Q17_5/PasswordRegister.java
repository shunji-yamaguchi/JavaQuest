
/**.
 * List17-14では、
 * PasswordRegisterはpublicになっていないので、
 * mytool.security以外のパッケージから利用できません。
 * PasswordRegisterを他のパッケージからも利用できるようにするためには、
 * どのようにプログラムを修正すればよいですか。
 *
 * List17-14
 * package mytool.security;
 * import yourtool.*;
 *
 * public class PasswordChecker {
 *
 * }
 *
 * class PasswordRegister {
 *
 * }
*/

package Q17_15;
import yourtool.*;

public class PasswordChecker {

}

public class PasswordRegister {

}
