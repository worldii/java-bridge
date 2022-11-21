package bridge;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class DirectionInputTest {

    @DisplayName("Direction 은 U 또는 D 여야 한다.")
    @Test
    void Direction_D_R() {
        String bridgeMoving = "A";
        assertThatThrownBy(() -> Validator.validateMoving(bridgeMoving)).isInstanceOf(
            IllegalArgumentException.class);
    }
}
