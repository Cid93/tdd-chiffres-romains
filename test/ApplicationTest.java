import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import models.NombreDecimal;
import models.NombreRomain;

/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    void assert_en_romain(int d, String r) {
		assertThat(new NombreDecimal(d).en_romain()).isEqualTo(r);
    }

    @Test
    public void romain_unites() {
		assert_en_romain(0, "");
		assert_en_romain(1, "I");
		assert_en_romain(2, "II");
		assert_en_romain(3, "III");
		assert_en_romain(4, "IV");
		assert_en_romain(5, "V");
		assert_en_romain(6, "VI");
		assert_en_romain(7, "VII");
		assert_en_romain(8, "VIII");
		assert_en_romain(9, "IX");
		assert_en_romain(10, "X");
		assert_en_romain(11, "XI");
		assert_en_romain(12, "XII");
		assert_en_romain(13, "XIII");
		assert_en_romain(14, "XIV");
		assert_en_romain(15, "XV");
		assert_en_romain(16, "XVI");
		assert_en_romain(17, "XVII");
		assert_en_romain(18, "XVIII");
		assert_en_romain(19, "XIX");
		assert_en_romain(20, "XX");
		assert_en_romain(21, "XXI");
		assert_en_romain(22, "XXII");
		assert_en_romain(23, "XXIII");
		assert_en_romain(24, "XXIV");
		assert_en_romain(25, "XXV");
		assert_en_romain(26, "XXVI");
		assert_en_romain(27, "XXVII");
		assert_en_romain(28, "XXVIII");
		assert_en_romain(29, "XXIX");
		assert_en_romain(30, "XXX");
		assert_en_romain(31, "XXXI");
		assert_en_romain(32, "XXXII");
		assert_en_romain(33, "XXXIII");
		assert_en_romain(34, "XXXIV");
		assert_en_romain(35, "XXXV");
		assert_en_romain(36, "XXXVI");
		assert_en_romain(37, "XXXVII");
		assert_en_romain(38, "XXXVIII");
		assert_en_romain(39, "XXXIX");
		assert_en_romain(40, "XL");
    }
}
