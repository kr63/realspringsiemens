package never_use_switch_lab;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generate(MailInfo mailInfo) {

        // 60 lines of code
        return "don't call us Nikolas!!!";
    }

    @Override
    public int getMyType() {
        return 2;
    }
}
